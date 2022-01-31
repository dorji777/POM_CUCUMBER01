$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/WebsiteLaunch.feature");
formatter.feature({
  "name": "Launch websites and test validation",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Loginfeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Sky Blue Background",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Loginfeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button;",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefination.i_click_on_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
});