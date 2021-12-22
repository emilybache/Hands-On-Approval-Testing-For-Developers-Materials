Exercise 1: Supermarket Receipt
===============================

Check things off the list by adding an X between the square brackets [ ]

1.[ ] Run the 'tenPercentDiscount' test case in SupermarketTest and check that it passes
2.[ ] Re-write this test case to use Approvals instead of assertions
      - [ ] After the 'Act' step, use the ReceiptPrinter class to create a string representation of the receipt. Use `new ReceiptPrinter().printReceipt(receipt)`  
      - [ ] In the 'Assert' part of the test case add a call to `Approvals.verify()`. The argument should be the string representation of the receipt.
      - [ ] Run the test and check that it fails. Approval tests always fail the first time, since there is no Approved file to compare against. Open the received file, it should be in the same folder as the test case, and be named after the test case: `src/test/java/dojo/supermarket/model/SupermarketTest.tenPercentDiscount.received.txt`
      - [ ] Examine the contents of the received file and check it contains all the information that is also being asserted in the test case. 
      - [ ] Approve this result by renaming the `xx.received.txt` file to be called `xxx.approved.txt` instead. 
      - [ ] Run the test again and check that it passes now. Since the received result exactly matches the approved result, the tool also removes the received file as it is redundant.
      - [ ] Remove all the assertions. You now have an approval test which checks the same things.
      - [ ] Make a commit now that you have a passing approval test. Be sure to add the approved file as well as the updated test code. 
3.[ ] Update this test so it actually has a ten percent discount.
      - [ ] Add some toothbrushes to your shopping cart in the 'Arrange' part of the test. `cart.addItemQuantity(toothbrush, 2);`
      - [ ] Run the test, it should fail since the receipt is different now. Find the received file that has been created.
      - [ ] Open a file diff showing the differences between the received and approved file. In IntelliJ, shift click to select both files, then right click and select 'Compare Files'
      - [ ] Examine the diff. Is it what you expected? If you think it's ok to approve this new result, use the diff-merge tool to add the changes to the approved file.
      - [ ] Run the test to check it passes now
      - [ ] Make a new commit in version control. Be sure to add both the updated test case and the updated approved file.
4.[ ] Add more tests for other kinds of discount.
    - Note that you can see the other kinds of available discount in the `SpecialOfferType` enum.
    - Don't worry too much about the third argument to `teller.addSpecialOffer` - it's not always used.
   
