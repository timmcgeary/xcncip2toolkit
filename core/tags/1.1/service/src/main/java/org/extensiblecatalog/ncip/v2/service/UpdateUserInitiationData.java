/**
 * Copyright (c) 2010 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php. 
 */

package org.extensiblecatalog.ncip.v2.service;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import java.util.GregorianCalendar;
import java.util.List;
import java.math.BigDecimal;

/**
 * Carries data elements describing the UpdateUser.
 */
public class UpdateUserInitiationData implements NCIPInitiationData {

//    public MessageType getMessageType() { return NCIPData.MessageType.INITIATION; }
//    public boolean isInitiationMessage() { return true; }
//    public boolean isResponseMessage() { return false; }

    /** Version attribute */
    protected String version;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * InitiationHeader
     */
    protected org.extensiblecatalog.ncip.v2.service.InitiationHeader initiationHeader;

    /**
     * Set InitiationHeader.
     */
    public void setInitiationHeader(org.extensiblecatalog.ncip.v2.service.InitiationHeader initiationHeader) {

        this.initiationHeader = initiationHeader;

    }

    /**
     * Get InitiationHeader.
     */
    public org.extensiblecatalog.ncip.v2.service.InitiationHeader getInitiationHeader() {

        return initiationHeader;

    }

    /**
     * MandatedAction
     */
    protected org.extensiblecatalog.ncip.v2.service.MandatedAction mandatedAction;

    /**
     * Set MandatedAction.
     */
    public void setMandatedAction(org.extensiblecatalog.ncip.v2.service.MandatedAction mandatedAction) {

        this.mandatedAction = mandatedAction;

    }

    /**
     * Get MandatedAction.
     */
    public org.extensiblecatalog.ncip.v2.service.MandatedAction getMandatedAction() {

        return mandatedAction;

    }

    /**
     * UserId
     */
    protected org.extensiblecatalog.ncip.v2.service.UserId userId;

    /**
     * Set UserId.
     */
    public void setUserId(org.extensiblecatalog.ncip.v2.service.UserId userId) {

        this.userId = userId;

    }

    /**
     * Get UserId.
     */
    public org.extensiblecatalog.ncip.v2.service.UserId getUserId() {

        return userId;

    }

    /**
     * AuthenticationInputs
     */
    protected List<org.extensiblecatalog.ncip.v2.service.AuthenticationInput> authenticationInputs;

    /**
     * Set AuthenticationInputs.
     */
    public void setAuthenticationInputs(
        List<org.extensiblecatalog.ncip.v2.service.AuthenticationInput> authenticationInputs) {

        this.authenticationInputs = authenticationInputs;

    }

    /**
     * Get AuthenticationInputs.
     */
    public List<org.extensiblecatalog.ncip.v2.service.AuthenticationInput> getAuthenticationInputs() {

        return authenticationInputs;

    }

    /**
     * DeleteUserFields
     */
    protected org.extensiblecatalog.ncip.v2.service.DeleteUserFields deleteUserFields;

    /**
     * Set DeleteUserFields.
     */
    public void setDeleteUserFields(org.extensiblecatalog.ncip.v2.service.DeleteUserFields deleteUserFields) {

        this.deleteUserFields = deleteUserFields;

    }

    /**
     * Get DeleteUserFields.
     */
    public org.extensiblecatalog.ncip.v2.service.DeleteUserFields getDeleteUserFields() {

        return deleteUserFields;

    }

    /**
     * AddUserFields
     */
    protected org.extensiblecatalog.ncip.v2.service.AddUserFields addUserFields;

    /**
     * Set AddUserFields.
     */
    public void setAddUserFields(org.extensiblecatalog.ncip.v2.service.AddUserFields addUserFields) {

        this.addUserFields = addUserFields;

    }

    /**
     * Get AddUserFields.
     */
    public org.extensiblecatalog.ncip.v2.service.AddUserFields getAddUserFields() {

        return addUserFields;

    }

    /**
     * Generic toString() implementation.
     *
     * @return String
     */
    @Override
    public String toString() {

        return ReflectionToStringBuilder.reflectionToString(this);

    }

}
