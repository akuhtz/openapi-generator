package org.openapitools.server

import org.apache.pekko.http.scaladsl.Http
import org.apache.pekko.http.scaladsl.server.Route
import org.openapitools.server.api.PetApi
import org.openapitools.server.api.StoreApi
import org.openapitools.server.api.UserApi

import org.apache.pekko.http.scaladsl.server.Directives._
import org.apache.pekko.actor.ActorSystem
import org.apache.pekko.stream.Materializer

class Controller(pet: PetApi, store: StoreApi, user: UserApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = pet.route ~ store.route ~ user.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}
