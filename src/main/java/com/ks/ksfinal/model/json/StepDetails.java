package com.ks.ksfinal.model.json;

import java.util.ArrayList;

public class StepDetails {
  private String layout;
  private String stepTitle;
  private String subLayout;
  private String listOption;
  private String failureFlow;
  private String multiLayout;
  private String successFlow;
  private String previousFlow;
  private String searchOption;
  private boolean actionOnClick;
  private boolean addbuttonlist;
  private String biometricType;
  private String listCondition;
  private boolean dontShowButton;
  private String redirectionUrl;
  private boolean hasOptionalFlow;
  private String dynamicStepTitle;
  private String submitButtonText;
  private boolean timerConfirmation;
  private String redirectionAttribute;
  ArrayList<Object> multiLayoutbuttonOptions = new ArrayList<Object>();
  ArrayList<Object> multiLayoutbuttonOptionsArray = new ArrayList<Object>();


 // Getter Methods 

  public String getLayout() {
    return layout;
  }

  public String getStepTitle() {
    return stepTitle;
  }

  public String getSubLayout() {
    return subLayout;
  }

  public String getListOption() {
    return listOption;
  }

  public String getFailureFlow() {
    return failureFlow;
  }

  public String getMultiLayout() {
    return multiLayout;
  }

  public String getSuccessFlow() {
    return successFlow;
  }

  public String getPreviousFlow() {
    return previousFlow;
  }

  public String getSearchOption() {
    return searchOption;
  }

  public boolean getActionOnClick() {
    return actionOnClick;
  }

  public boolean getAddbuttonlist() {
    return addbuttonlist;
  }

  public String getBiometricType() {
    return biometricType;
  }

  public String getListCondition() {
    return listCondition;
  }

  public boolean getDontShowButton() {
    return dontShowButton;
  }

  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  public boolean getHasOptionalFlow() {
    return hasOptionalFlow;
  }

  public String getDynamicStepTitle() {
    return dynamicStepTitle;
  }

  public String getSubmitButtonText() {
    return submitButtonText;
  }

  public boolean getTimerConfirmation() {
    return timerConfirmation;
  }

  public String getRedirectionAttribute() {
    return redirectionAttribute;
  }

 // Setter Methods 

  public void setLayout( String layout ) {
    this.layout = layout;
  }

  public void setStepTitle( String stepTitle ) {
    this.stepTitle = stepTitle;
  }

  public void setSubLayout( String subLayout ) {
    this.subLayout = subLayout;
  }

  public void setListOption( String listOption ) {
    this.listOption = listOption;
  }

  public void setFailureFlow( String failureFlow ) {
    this.failureFlow = failureFlow;
  }

  public void setMultiLayout( String multiLayout ) {
    this.multiLayout = multiLayout;
  }

  public void setSuccessFlow( String successFlow ) {
    this.successFlow = successFlow;
  }

  public void setPreviousFlow( String previousFlow ) {
    this.previousFlow = previousFlow;
  }

  public void setSearchOption( String searchOption ) {
    this.searchOption = searchOption;
  }

  public void setActionOnClick( boolean actionOnClick ) {
    this.actionOnClick = actionOnClick;
  }

  public void setAddbuttonlist( boolean addbuttonlist ) {
    this.addbuttonlist = addbuttonlist;
  }

  public void setBiometricType( String biometricType ) {
    this.biometricType = biometricType;
  }

  public void setListCondition( String listCondition ) {
    this.listCondition = listCondition;
  }

  public void setDontShowButton( boolean dontShowButton ) {
    this.dontShowButton = dontShowButton;
  }

  public void setRedirectionUrl( String redirectionUrl ) {
    this.redirectionUrl = redirectionUrl;
  }

  public void setHasOptionalFlow( boolean hasOptionalFlow ) {
    this.hasOptionalFlow = hasOptionalFlow;
  }

  public void setDynamicStepTitle( String dynamicStepTitle ) {
    this.dynamicStepTitle = dynamicStepTitle;
  }

  public void setSubmitButtonText( String submitButtonText ) {
    this.submitButtonText = submitButtonText;
  }

  public void setTimerConfirmation( boolean timerConfirmation ) {
    this.timerConfirmation = timerConfirmation;
  }

  public void setRedirectionAttribute( String redirectionAttribute ) {
    this.redirectionAttribute = redirectionAttribute;
  }
}