package com.ks.ksfinal.model.json;

import java.util.ArrayList;

public class ConfigurationColumns {
  ArrayList<Object> data = new ArrayList<Object>();
  private String step;
  ArrayList<Object> store = new ArrayList<Object>();
  StepDetails StepDetailsObject;
  ArrayList<Object> pathParameter = new ArrayList<Object>();
  ArrayList<Object> queryParameter = new ArrayList<Object>();
  RequestParameter RequestParameterObject;
  ResponseHandling ResponseHandlingObject;


 // Getter Methods 

  public String getStep() {
    return step;
  }

  public StepDetails getStepDetails() {
    return StepDetailsObject;
  }

  public RequestParameter getRequestParameter() {
    return RequestParameterObject;
  }

  public ResponseHandling getResponseHandling() {
    return ResponseHandlingObject;
  }

 // Setter Methods 

  public void setStep( String step ) {
    this.step = step;
  }

  public void setStepDetails( StepDetails stepDetailsObject ) {
    this.StepDetailsObject = stepDetailsObject;
  }

  public void setRequestParameter( RequestParameter requestParameterObject ) {
    this.RequestParameterObject = requestParameterObject;
  }

  public void setResponseHandling( ResponseHandling responseHandlingObject ) {
    this.ResponseHandlingObject = responseHandlingObject;
  }
}