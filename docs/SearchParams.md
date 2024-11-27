# # SearchParams
contains params needed to perform search

## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offset**| **Long** | number of the record where to start to take result for pagination  | [optional]
**limit**| **Long** | number of search result for page  | [optional]
**term**| **String** | term to search  | [optional]
**searchables**| [**List<SearchParamSearchable>**](SearchParamSearchable.md) | list of attributes where to search the indicated term, if not indicated it uses all in those present in index configuration  | [optional] [default to new ArrayList<>()]
**filters**| [**List<SearchParamFilter>**](SearchParamFilter.md) | list of attribute and relative value which you want to filter search results  | [optional] [default to new ArrayList<>()]
**attributes**| [**List<SearchParamAttribute>**](SearchParamAttribute.md) | attributes that you want to be present in search results  | [optional] [default to new ArrayList<>()]
**facets**| [**List<SearchParamFacet>**](SearchParamFacet.md) | list of attributes you want to create aggregation to make filter suggestion  | [optional] [default to new ArrayList<>()]
**sorts**| [**List<SearchParamSort>**](SearchParamSort.md) | params to sort search results  | [optional] [default to new ArrayList<>()]
**minScore**| **Float** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

