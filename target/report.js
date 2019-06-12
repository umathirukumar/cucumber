$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Addcustomer.feature");
formatter.feature({
  "name": "To test add customer functionality",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To test the customer id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user fill in valid customer details",
  "keyword": "When "
});
formatter.match({
  "location": "Addcustomer.the_user_fill_in_valid_customer_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user click the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "Addcustomer.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should see the customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcustomer.the_user_should_see_the_customer_id_is_generated()"
});
formatter.result({
  "status": "skipped"
});
});