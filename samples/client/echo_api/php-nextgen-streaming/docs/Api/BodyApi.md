# OpenAPI\Client\BodyApi

All URIs are relative to http://localhost:3000, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**testBinaryGif()**](BodyApi.md#testBinaryGif) | **POST** /binary/gif | Test binary (gif) response body |
| [**testBodyApplicationOctetstreamBinary()**](BodyApi.md#testBodyApplicationOctetstreamBinary) | **POST** /body/application/octetstream/binary | Test body parameter(s) |
| [**testBodyMultipartFormdataArrayOfBinary()**](BodyApi.md#testBodyMultipartFormdataArrayOfBinary) | **POST** /body/application/octetstream/array_of_binary | Test array of binary in multipart mime |
| [**testBodyMultipartFormdataSingleBinary()**](BodyApi.md#testBodyMultipartFormdataSingleBinary) | **POST** /body/application/octetstream/single_binary | Test single binary in multipart mime |
| [**testEchoBodyAllOfPet()**](BodyApi.md#testEchoBodyAllOfPet) | **POST** /echo/body/allOf/Pet | Test body parameter(s) |
| [**testEchoBodyFreeFormObjectResponseString()**](BodyApi.md#testEchoBodyFreeFormObjectResponseString) | **POST** /echo/body/FreeFormObject/response_string | Test free form object |
| [**testEchoBodyPet()**](BodyApi.md#testEchoBodyPet) | **POST** /echo/body/Pet | Test body parameter(s) |
| [**testEchoBodyPetResponseString()**](BodyApi.md#testEchoBodyPetResponseString) | **POST** /echo/body/Pet/response_string | Test empty response body |
| [**testEchoBodyStringEnum()**](BodyApi.md#testEchoBodyStringEnum) | **POST** /echo/body/string_enum | Test string enum response body |
| [**testEchoBodyTagResponseString()**](BodyApi.md#testEchoBodyTagResponseString) | **POST** /echo/body/Tag/response_string | Test empty json (request body) |


## `testBinaryGif()`

```php
testBinaryGif(): \Psr\Http\Message\StreamInterface
```

Test binary (gif) response body

Test binary (gif) response body

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->testBinaryGif();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testBinaryGif: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\Psr\Http\Message\StreamInterface**](../Model/\Psr\Http\Message\StreamInterface.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `image/gif`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testBodyApplicationOctetstreamBinary()`

```php
testBodyApplicationOctetstreamBinary($body): string
```

Test body parameter(s)

Test body parameter(s)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = '/path/to/file.txt'; // \Psr\Http\Message\StreamInterface

try {
    $result = $apiInstance->testBodyApplicationOctetstreamBinary($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testBodyApplicationOctetstreamBinary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **\Psr\Http\Message\StreamInterface****\Psr\Http\Message\StreamInterface**|  | [optional] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/octet-stream`
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testBodyMultipartFormdataArrayOfBinary()`

```php
testBodyMultipartFormdataArrayOfBinary($files): string
```

Test array of binary in multipart mime

Test array of binary in multipart mime

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$files = array('/path/to/file.txt'); // \Psr\Http\Message\StreamInterface[]

try {
    $result = $apiInstance->testBodyMultipartFormdataArrayOfBinary($files);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testBodyMultipartFormdataArrayOfBinary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **files** | **\Psr\Http\Message\StreamInterface[]**|  | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testBodyMultipartFormdataSingleBinary()`

```php
testBodyMultipartFormdataSingleBinary($my_file): string
```

Test single binary in multipart mime

Test single binary in multipart mime

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$my_file = '/path/to/file.txt'; // \Psr\Http\Message\StreamInterface

try {
    $result = $apiInstance->testBodyMultipartFormdataSingleBinary($my_file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testBodyMultipartFormdataSingleBinary: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **my_file** | **\Psr\Http\Message\StreamInterface****\Psr\Http\Message\StreamInterface**|  | [optional] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testEchoBodyAllOfPet()`

```php
testEchoBodyAllOfPet($pet): \OpenAPI\Client\Model\Pet
```

Test body parameter(s)

Test body parameter(s)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$pet = new \OpenAPI\Client\Model\Pet(); // \OpenAPI\Client\Model\Pet | Pet object that needs to be added to the store

try {
    $result = $apiInstance->testEchoBodyAllOfPet($pet);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testEchoBodyAllOfPet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pet** | [**\OpenAPI\Client\Model\Pet**](../Model/Pet.md)| Pet object that needs to be added to the store | [optional] |

### Return type

[**\OpenAPI\Client\Model\Pet**](../Model/Pet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testEchoBodyFreeFormObjectResponseString()`

```php
testEchoBodyFreeFormObjectResponseString($body): string
```

Test free form object

Test free form object

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = array('key' => new \stdClass); // object | Free form object

try {
    $result = $apiInstance->testEchoBodyFreeFormObjectResponseString($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testEchoBodyFreeFormObjectResponseString: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **object**| Free form object | [optional] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testEchoBodyPet()`

```php
testEchoBodyPet($pet): \OpenAPI\Client\Model\Pet
```

Test body parameter(s)

Test body parameter(s)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$pet = new \OpenAPI\Client\Model\Pet(); // \OpenAPI\Client\Model\Pet | Pet object that needs to be added to the store

try {
    $result = $apiInstance->testEchoBodyPet($pet);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testEchoBodyPet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pet** | [**\OpenAPI\Client\Model\Pet**](../Model/Pet.md)| Pet object that needs to be added to the store | [optional] |

### Return type

[**\OpenAPI\Client\Model\Pet**](../Model/Pet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testEchoBodyPetResponseString()`

```php
testEchoBodyPetResponseString($pet): string
```

Test empty response body

Test empty response body

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$pet = new \OpenAPI\Client\Model\Pet(); // \OpenAPI\Client\Model\Pet | Pet object that needs to be added to the store

try {
    $result = $apiInstance->testEchoBodyPetResponseString($pet);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testEchoBodyPetResponseString: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pet** | [**\OpenAPI\Client\Model\Pet**](../Model/Pet.md)| Pet object that needs to be added to the store | [optional] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testEchoBodyStringEnum()`

```php
testEchoBodyStringEnum($body): \OpenAPI\Client\Model\StringEnumRef
```

Test string enum response body

Test string enum response body

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = 'body_example'; // string | String enum

try {
    $result = $apiInstance->testEchoBodyStringEnum($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testEchoBodyStringEnum: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **string**| String enum | [optional] |

### Return type

[**\OpenAPI\Client\Model\StringEnumRef**](../Model/StringEnumRef.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `testEchoBodyTagResponseString()`

```php
testEchoBodyTagResponseString($tag): string
```

Test empty json (request body)

Test empty json (request body)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\BodyApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$tag = new \OpenAPI\Client\Model\Tag(); // \OpenAPI\Client\Model\Tag | Tag object

try {
    $result = $apiInstance->testEchoBodyTagResponseString($tag);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BodyApi->testEchoBodyTagResponseString: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tag** | [**\OpenAPI\Client\Model\Tag**](../Model/Tag.md)| Tag object | [optional] |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
