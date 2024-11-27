# # SearchResult
contains the search results, aggregations and paging information

## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index**| **String** | index where the data were extrapolated  |
**params**| [**SearchParams**](SearchParams.md) |   | [optional]
**page**| **Long** | page number of the results you are processing  | [optional]
**totalPages**| **Long** | number of pages of results  | [optional]
**totalHits**| **Long** | number of total search results  | [optional]
**hits**| **List<String>** | search result records contained in the specified page  | [optional] [default to new ArrayList<>()]
**aggregations**| [**Map<String, SearchAggrMap>**](SearchAggrMap.md) | array of aggregation obtained by search result  | [optional] [default to new HashMap<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

