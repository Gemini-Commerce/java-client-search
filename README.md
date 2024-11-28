# openapi-java-client

Search Service
- API version: v1
  - Build date: 2024-11-28T11:12:56.191245973Z[Etc/UTC]
  - Generator version: 7.9.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import GeminiCommerce.Search.ApiClient;
import GeminiCommerce.Search.ApiException;
import GeminiCommerce.Search.Configuration;
import GeminiCommerce.Search.auth.*;
import org.openapitools.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://search.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SearchApi* | [**searchConfiguration**](docs/SearchApi.md#searchConfiguration) | **POST** /search.Search/Configuration | Indexes configuration
*SearchApi* | [**searchDelete**](docs/SearchApi.md#searchDelete) | **POST** /search.Search/Delete | Delete Indexes
*SearchApi* | [**searchInsertOrReplace**](docs/SearchApi.md#searchInsertOrReplace) | **POST** /search.Search/InsertOrReplace | Insert or replace documents to different elasticsearch indexes
*SearchApi* | [**searchMSearch**](docs/SearchApi.md#searchMSearch) | **POST** /search.Search/MSearch | Send queries to different elasticsearch indexes
*SearchApi* | [**searchUpdate**](docs/SearchApi.md#searchUpdate) | **POST** /search.Search/Update | Update documents to different elasticsearch indexes


## Documentation for Models

 - [ParamSortOrder](docs/ParamSortOrder.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [SearchAggrMap](docs/SearchAggrMap.md)
 - [SearchConfigRequest](docs/SearchConfigRequest.md)
 - [SearchConfigSchema](docs/SearchConfigSchema.md)
 - [SearchConfigSchemaAttribute](docs/SearchConfigSchemaAttribute.md)
 - [SearchConfigSchemaAttributeType](docs/SearchConfigSchemaAttributeType.md)
 - [SearchConfigSchemaFacet](docs/SearchConfigSchemaFacet.md)
 - [SearchConfigSchemaFilter](docs/SearchConfigSchemaFilter.md)
 - [SearchConfigSchemaSearchable](docs/SearchConfigSchemaSearchable.md)
 - [SearchConfigSchemaSortable](docs/SearchConfigSchemaSortable.md)
 - [SearchDeleteConstraints](docs/SearchDeleteConstraints.md)
 - [SearchDeleteError](docs/SearchDeleteError.md)
 - [SearchDeleteRequest](docs/SearchDeleteRequest.md)
 - [SearchDeleteResponse](docs/SearchDeleteResponse.md)
 - [SearchParamAttribute](docs/SearchParamAttribute.md)
 - [SearchParamFacet](docs/SearchParamFacet.md)
 - [SearchParamFacetType](docs/SearchParamFacetType.md)
 - [SearchParamFilter](docs/SearchParamFilter.md)
 - [SearchParamFilterType](docs/SearchParamFilterType.md)
 - [SearchParamSearchable](docs/SearchParamSearchable.md)
 - [SearchParamSort](docs/SearchParamSort.md)
 - [SearchParams](docs/SearchParams.md)
 - [SearchPayload](docs/SearchPayload.md)
 - [SearchQueryError](docs/SearchQueryError.md)
 - [SearchQueryRequest](docs/SearchQueryRequest.md)
 - [SearchQueryRequestType](docs/SearchQueryRequestType.md)
 - [SearchQueryResponse](docs/SearchQueryResponse.md)
 - [SearchResult](docs/SearchResult.md)
 - [SearchWriteError](docs/SearchWriteError.md)
 - [SearchWriteRequest](docs/SearchWriteRequest.md)
 - [SearchWriteResponse](docs/SearchWriteResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="geminiAuthorization"></a>
### geminiAuthorization

- **Type**: API key
- **API key parameter name**: X-Gem-Token
- **Location**: HTTP header

<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com

