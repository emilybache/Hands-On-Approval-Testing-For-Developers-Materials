Exercise 2: Xml Reports
=======================

The class you want to test is `XMLExporter` - you should aim for 100% code coverage. You should use the `Approvals.verifyXml()` method since the result you want to verify is in XML format. There is [reference documentation](https://github.com/approvals/ApprovalTests.Java/blob/master/approvaltests/docs/reference/Verify.md) for all the available verify methods in Approvals.

1) [ ] Find the empty test case: `XMLExporterTest`. Check you can run it even though it is empty.
2) [ ] Write a test for the `exportFull` method on `XMLExporter` 
    - [ ] Re-name the test case `testSomething` to `exportFull`
    - [ ] Call the function `XMLExporter.exportFull`. You will need to pass an argument - a list of `Order` objects. You can find test data in the `SampleModelObjects` class. For example use `List.of(RecentOrder)` 
    - [ ] Use the the result from the call to `XMLExporter.exportFull` as the string Approvals should verify. Since it is xml, use the `Approvals.verifyXml` method.
    - [ ] Run the test case. It should fail and write a received file. Examine this file.
    - [ ] If the received file looks ok, approve it by renaming it from `xx.received.xml` to `xx.approved.xml`
    - [ ] Run the test again and check it passes now
    - [ ] Make a commit in version control, be sure to include the approved file.
3) [ ] Improve the code coverage until 100% of the lines in `XMLExporter.exportFull` are covered.
    - [ ] You will need an Order which contains a Product that has non-zero weight. There are several such products in `SampleModelObjects`. Add one to the order.
    - [ ] Run the test, it should fail now since the xml report has changed. Examine the diff between received and approved files. 
    - [ ] If the changes look ok, approve the result either by renaming the received file to approved or using the diff-merge tool to transfer changes.
    - [ ] The test should pass now, run it again with coverage and check if it is 100% for this function.
    - [ ] Make a commit in version control with your updated test case. Be sure to include the approved file.
4) [ ] Add further test cases for the other methods in XMLExporter. Feel free to add more data in SampleModelObjects or modify what's there so you can get 100% coverage.
   
