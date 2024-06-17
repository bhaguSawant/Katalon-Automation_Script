package com.mypackage.myfirstcustomkeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.inspect.swingui.ObjectBrowser
import internal.GlobalVariable

public class customkeyword1 {

	@ Keyword
	//openBrowser
	public void openBrowser()
	{
		WebUI.openBrowser("https://demos.telerik.com/aspnet-ajax/autocompletebox/examples/default/defaultcs.aspx")

		WebUI.waitForPageLoad(2)

		WebUI.maximizeWindow()
	}

	@Keyword
	//closeBrowser
	public void closeBrowser()
	{
		WebUI.closeBrowser()

	}
}
