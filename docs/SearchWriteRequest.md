# # SearchWriteRequest
contains where and what data to write in search storage

## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** | tenant id data identifier where to write data [#DOCGENBUG REQUIRED FIELD]  | [optional]
**index**| **String** | elasticsearch index identifier where to write data  |
**documents**| **List<String>** | A JSON array of documents to write or update  | [default to new ArrayList<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

