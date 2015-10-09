package com.cusguss.fungimonitor.thingspeak.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by scristea on 10/9/2015.
 */
public class Last {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("entry_id")
    @Expose
    private Integer entryId;
    @SerializedName("field1")
    @Expose
    private String field1;
    @SerializedName("field2")
    @Expose
    private String field2;
    @SerializedName("field3")
    @Expose
    private String field3;
    @SerializedName("field4")
    @Expose
    private String field4;
    @SerializedName("field5")
    @Expose
    private String field5;
    @SerializedName("field6")
    @Expose
    private String field6;
    @SerializedName("field7")
    @Expose
    private String field7;

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The entryId
     */
    public Integer getEntryId() {
        return entryId;
    }

    /**
     * @param entryId The entry_id
     */
    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    /**
     * @return The field1
     */
    public String getField1() {
        return field1;
    }

    /**
     * @param field1 The field1
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }

    /**
     * @return The field2
     */
    public String getField2() {
        return field2;
    }

    /**
     * @param field2 The field2
     */
    public void setField2(String field2) {
        this.field2 = field2;
    }

    /**
     * @return The field3
     */
    public String getField3() {
        return field3;
    }

    /**
     * @param field3 The field3
     */
    public void setField3(String field3) {
        this.field3 = field3;
    }

    /**
     * @return The field4
     */
    public String getField4() {
        return field4;
    }

    /**
     * @param field4 The field4
     */
    public void setField4(String field4) {
        this.field4 = field4;
    }

    /**
     * @return The field5
     */
    public String getField5() {
        return field5;
    }

    /**
     * @param field5 The field5
     */
    public void setField5(String field5) {
        this.field5 = field5;
    }

    /**
     * @return The field6
     */
    public String getField6() {
        return field6;
    }

    /**
     * @param field6 The field6
     */
    public void setField6(String field6) {
        this.field6 = field6;
    }

    /**
     * @return The field7
     */
    public String getField7() {
        return field7;
    }

    /**
     * @param field7 The field7
     */
    public void setField7(String field7) {
        this.field7 = field7;
    }


}
