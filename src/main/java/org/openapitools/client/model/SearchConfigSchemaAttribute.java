/*
 * Search Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.SearchConfigSchemaAttributeType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Search.JSON;

/**
 * contains the configurations needed to define an attribute within documents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-27T14:37:24.985944871Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SearchConfigSchemaAttribute {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SearchConfigSchemaAttributeType type = SearchConfigSchemaAttributeType.TEXT;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public SearchConfigSchemaAttribute() {
  }

  public SearchConfigSchemaAttribute name(String name) {
    this.name = name;
    return this;
  }

  /**
   * attribute name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SearchConfigSchemaAttribute type(SearchConfigSchemaAttributeType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public SearchConfigSchemaAttributeType getType() {
    return type;
  }

  public void setType(SearchConfigSchemaAttributeType type) {
    this.type = type;
  }


  public SearchConfigSchemaAttribute language(String language) {
    this.language = language;
    return this;
  }

  /**
   * locale code (currently only it_IT and en_US are supported)
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SearchConfigSchemaAttribute instance itself
   */
  public SearchConfigSchemaAttribute putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchConfigSchemaAttribute searchConfigSchemaAttribute = (SearchConfigSchemaAttribute) o;
    return Objects.equals(this.name, searchConfigSchemaAttribute.name) &&
        Objects.equals(this.type, searchConfigSchemaAttribute.type) &&
        Objects.equals(this.language, searchConfigSchemaAttribute.language)&&
        Objects.equals(this.additionalProperties, searchConfigSchemaAttribute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, language, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchConfigSchemaAttribute {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchConfigSchemaAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchConfigSchemaAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchConfigSchemaAttribute is not found in the empty JSON string", SearchConfigSchemaAttribute.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchConfigSchemaAttribute.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        SearchConfigSchemaAttributeType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchConfigSchemaAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchConfigSchemaAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchConfigSchemaAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchConfigSchemaAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchConfigSchemaAttribute>() {
           @Override
           public void write(JsonWriter out, SearchConfigSchemaAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchConfigSchemaAttribute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SearchConfigSchemaAttribute instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchConfigSchemaAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchConfigSchemaAttribute
   * @throws IOException if the JSON string is invalid with respect to SearchConfigSchemaAttribute
   */
  public static SearchConfigSchemaAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchConfigSchemaAttribute.class);
  }

  /**
   * Convert an instance of SearchConfigSchemaAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
