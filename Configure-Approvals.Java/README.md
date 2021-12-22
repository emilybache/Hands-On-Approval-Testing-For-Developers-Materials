Configuring Approvals.Java
==========================

Firstly you should find the [website for Approvals](https://approvaltests.com/), which has some general information about this family of tools. Click on the 'Java' symbol to go to the [Approvals.Java homepage](https://github.com/approvals/approvaltests.java). Take a look at the README file (scroll down past the information about the project sourcecode).


## Adding the dependency to Approvals.Java
For an existing project where you want to start using Approvals, you will need to add the dependency to your gradle or maven file. Check out the [example dependency declarations](https://github.com/approvals/approvaltests.java#how-to-get-it). If it's a completely new project you might prefer to download one of the [starter projects](https://github.com/approvals/approvaltests.java#getting-started).

## Configuring your git settings
You will want to version control your approved files together with your test code. Be sure to add them when you make a commit. When a test fails, Approvals creates an additional 'received' file. You never want those files to be added to version control. Add this to your .gitignore file to avoid that:

	*.received.*

## Configuring Approvals.Java for your project
There are several settings you may want to customize. In particular, which _reporter_ Approvals.Java uses to show you test failures. This will usually be a graphical diff-merge tool when you are working on your development machine, and a plain text diff when you are running on the build server. You can configure the reporter via [PackageSettings](https://github.com/approvals/ApprovalTests.Java/blob/master/approvaltests/docs/Configuration.md#package-level-settings).

If you want a plain diff that will work on any platform, this is a good option for your PackageSettings class:

	import org.approvaltests.core.ApprovalFailureReporter;
	import org.approvaltests.reporters.JunitReporter;

	/**
	 * Configure the reporter used by Approval Tests.
	 */
	public class PackageSettings {
	    public static ApprovalFailureReporter UseReporter         = JunitReporter.INSTANCE;
	}   

When you're working on your development machine you may want a graphical diff tool instead. Simple replace "JunitReporter" with another tool, you can find a full list of what's available in the [documentation for Reporters](https://github.com/approvals/ApprovalTests.Java/blob/master/approvaltests/docs/Reporters.md).
