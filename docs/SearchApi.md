# SearchApi

All URIs are relative to *https://search.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchConfiguration**](SearchApi.md#searchConfiguration) | **POST** /search.Search/Configuration | Indexes configuration |
| [**searchDelete**](SearchApi.md#searchDelete) | **POST** /search.Search/Delete | Delete Indexes |
| [**searchInsertOrReplace**](SearchApi.md#searchInsertOrReplace) | **POST** /search.Search/InsertOrReplace | Insert or replace documents to different elasticsearch indexes |
| [**searchMSearch**](SearchApi.md#searchMSearch) | **POST** /search.Search/MSearch | Send queries to different elasticsearch indexes |
| [**searchUpdate**](SearchApi.md#searchUpdate) | **POST** /search.Search/Update | Update documents to different elasticsearch indexes |


<a id="searchConfiguration"></a>
# **searchConfiguration**
> Object searchConfiguration(body)

Indexes configuration

Create or update indexes by a passed configuration schema

### Example
```java
// Import classes:
import GeminiCommerce.Search.ApiClient;
import GeminiCommerce.Search.ApiException;
import GeminiCommerce.Search.Configuration;
import GeminiCommerce.Search.auth.*;
import GeminiCommerce.Search.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://search.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    // Configure API key authorization: geminiAuthorization
    ApiKeyAuth geminiAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("geminiAuthorization");
    geminiAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //geminiAuthorization.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    SearchConfigRequest body = new SearchConfigRequest(); // SearchConfigRequest | 
    try {
      Object result = apiInstance.searchConfiguration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**SearchConfigRequest**](SearchConfigRequest.md)|  | |

### Return type

**Object**

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [geminiAuthorization](../README.md#geminiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="searchDelete"></a>
# **searchDelete**
> SearchDeleteResponse searchDelete(body)

Delete Indexes

Delete indexes from ElasticSearch and Cassandra configuration

### Example
```java
// Import classes:
import GeminiCommerce.Search.ApiClient;
import GeminiCommerce.Search.ApiException;
import GeminiCommerce.Search.Configuration;
import GeminiCommerce.Search.auth.*;
import GeminiCommerce.Search.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://search.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    // Configure API key authorization: geminiAuthorization
    ApiKeyAuth geminiAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("geminiAuthorization");
    geminiAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //geminiAuthorization.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    SearchDeleteRequest body = new SearchDeleteRequest(); // SearchDeleteRequest | 
    try {
      SearchDeleteResponse result = apiInstance.searchDelete(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**SearchDeleteRequest**](SearchDeleteRequest.md)|  | |

### Return type

[**SearchDeleteResponse**](SearchDeleteResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [geminiAuthorization](../README.md#geminiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="searchInsertOrReplace"></a>
# **searchInsertOrReplace**
> SearchWriteResponse searchInsertOrReplace(body)

Insert or replace documents to different elasticsearch indexes

Insert or replace a document or more in a specified ElasticSearch index of a tenant

### Example
```java
// Import classes:
import GeminiCommerce.Search.ApiClient;
import GeminiCommerce.Search.ApiException;
import GeminiCommerce.Search.Configuration;
import GeminiCommerce.Search.auth.*;
import GeminiCommerce.Search.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://search.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    // Configure API key authorization: geminiAuthorization
    ApiKeyAuth geminiAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("geminiAuthorization");
    geminiAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //geminiAuthorization.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    SearchWriteRequest body = new SearchWriteRequest(); // SearchWriteRequest | 
    try {
      SearchWriteResponse result = apiInstance.searchInsertOrReplace(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchInsertOrReplace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**SearchWriteRequest**](SearchWriteRequest.md)|  | |

### Return type

[**SearchWriteResponse**](SearchWriteResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [geminiAuthorization](../README.md#geminiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="searchMSearch"></a>
# **searchMSearch**
> SearchQueryResponse searchMSearch(body)

Send queries to different elasticsearch indexes

MSearch promises to send a list of queries to elasticsearch to be executed on different indexes, it can also be used as an autocomplete by adding the corresponding TYPE

### Example
```java
// Import classes:
import GeminiCommerce.Search.ApiClient;
import GeminiCommerce.Search.ApiException;
import GeminiCommerce.Search.Configuration;
import GeminiCommerce.Search.auth.*;
import GeminiCommerce.Search.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://search.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    // Configure API key authorization: geminiAuthorization
    ApiKeyAuth geminiAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("geminiAuthorization");
    geminiAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //geminiAuthorization.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    SearchQueryRequest body = new SearchQueryRequest(); // SearchQueryRequest | 
    try {
      SearchQueryResponse result = apiInstance.searchMSearch(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchMSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**SearchQueryRequest**](SearchQueryRequest.md)|  | |

### Return type

[**SearchQueryResponse**](SearchQueryResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [geminiAuthorization](../README.md#geminiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="searchUpdate"></a>
# **searchUpdate**
> SearchWriteResponse searchUpdate(body)

Update documents to different elasticsearch indexes

Update a document or more in a specified ElasticSearch index of a tenant

### Example
```java
// Import classes:
import GeminiCommerce.Search.ApiClient;
import GeminiCommerce.Search.ApiException;
import GeminiCommerce.Search.Configuration;
import GeminiCommerce.Search.auth.*;
import GeminiCommerce.Search.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://search.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    // Configure API key authorization: geminiAuthorization
    ApiKeyAuth geminiAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("geminiAuthorization");
    geminiAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //geminiAuthorization.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    SearchWriteRequest body = new SearchWriteRequest(); // SearchWriteRequest | 
    try {
      SearchWriteResponse result = apiInstance.searchUpdate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**SearchWriteRequest**](SearchWriteRequest.md)|  | |

### Return type

[**SearchWriteResponse**](SearchWriteResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [geminiAuthorization](../README.md#geminiAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

