module mutsumutsutalk.whatweeted {
  // javafx main package
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;

  // javafx submodule package

  // normal program dependencies
  requires com.google.common;
  requires org.slf4j;
  requires twitter.api.java.sdk;
  requires scribejava.core;

  // annotations
  requires jsr305;
  requires lombok;
  requires com.fasterxml.jackson.annotation;

  opens mutsumutsutalk.whatweeted to javafx.fxml;
  exports mutsumutsutalk.whatweeted;
}