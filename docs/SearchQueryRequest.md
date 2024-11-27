# # SearchQueryRequest
contains search request information about how and where to make the search

## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** | tenant to search on [#DOCGENBUG REQUIRED FIELD]  | [optional]
**type**| [**SearchQueryRequestType**](SearchQueryRequestType.md) |  for more information please, see Model/SearchQueryRequestType.php  | [optional] [default to SearchQueryRequestType.STANDARD]
**payload**| [**List<SearchPayload>**](SearchPayload.md) | contains the search request payload  | [default to new ArrayList<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

