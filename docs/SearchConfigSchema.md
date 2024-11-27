# # SearchConfigSchema
contains index configurations fields

## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index**| **String** | index name, to create or where update configuration  |
**documentKeyName**| **String** | field which value will be used as document id [#DOCGENBUG REQUIRED FIELD]  | [optional]
**attributes**| [**List<SearchConfigSchemaAttribute>**](SearchConfigSchemaAttribute.md) | fields that can be stored into index and later retrieved  | [default to new ArrayList<>()]
**searchables**| [**List<SearchConfigSchemaSearchable>**](SearchConfigSchemaSearchable.md) | fields that can be used for fulltext searches  | [optional] [default to new ArrayList<>()]
**facets**| [**List<SearchConfigSchemaFacet>**](SearchConfigSchemaFacet.md) | fields that can be used for aggregations  | [optional] [default to new ArrayList<>()]
**filters**| [**List<SearchConfigSchemaFilter>**](SearchConfigSchemaFilter.md) | fields that can be used for filtering  | [optional] [default to new ArrayList<>()]
**sortables**| [**List<SearchConfigSchemaSortable>**](SearchConfigSchemaSortable.md) | fields that can be used for sorting  | [optional] [default to new ArrayList<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

