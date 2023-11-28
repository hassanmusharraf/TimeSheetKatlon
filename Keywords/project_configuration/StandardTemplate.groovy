package project_configuration

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.Components
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class StandardTemplate {

	@Keyword
	def add_project_detail() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/job/job-data/ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba/list?id=ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba&name=Standard%20Project')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/button_add Add Job Data'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputProject Number'), 'TPJ001')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputProject Name'), 'Adding name')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputProject Short Description'),
				'Desc')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/project_start_date'), GlobalVariable.TODAYS_DATE)

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project_End_Date'), GlobalVariable.DATE)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/div_Project NumberProject NameProject Short_4edab2'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputClient Number'), '001')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputClient Name'), 'Client XYZ')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project Manager'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Shanta Paul  shanta.paulqm.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project Administrator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Emp 5  emp5gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project Coordinator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/span_Emp 1  emp1gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Site Supervisor'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Meenaz Momin  meenazmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/WIP Method'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Job WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Job Union Code'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_U001'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputDaily LOA Amount Selection'),
				'555')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Country'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Nepal'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Province'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Bheri Zone'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Division'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_101  Hazmat'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Region'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_111  region name'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Location'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_101  Richmond BC'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Department'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_102  Operations Management'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/button_Save'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}



	@Keyword
	def update_project_detail() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/row-update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputProject Number'), 'TPJ002')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputProject Name'), 'updating name')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputProject Short Description'),
				'updating Desc')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/project_start_date'),GlobalVariable.TODAYS_DATE.toString())

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project_End_Date'), GlobalVariable.DATE.toString())

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/div_Project NumberProject NameProject Short_4edab2'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputClient Number'), '002')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputClient Name'), 'Updating Client XYZ')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project Manager'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_Emp 2  emp2gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project Administrator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_Emp 5  emp5gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Project Coordinator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/span_Emp 1  emp1gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Site Supervisor'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Meenaz Momin  meenazmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/WIP Method'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/WIP_Method_li2'))


		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Job WCB'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Job Union Code'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_U001'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/inputDaily LOA Amount Selection'),
				'666')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Country'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Nepal'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Province'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_Bheri Zone'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Division'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_101  Hazmat'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Region'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_111  region name'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Location'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_101  Richmond BC'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/Department'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/li_102  Operations Management'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/button_Save'))
	}


	
	@Keyword
	def add_task() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		Components.search_element('Adding name')
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/row-update'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/a_Tasks'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/button_add Add New'))
		
		WebUI.delay(2)
		
		//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/button_add_new_subtask'))
		//
		//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/inputName'),
		//    'Adding sub job')
		//
		//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/button_Add'))
		
		//WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/button_'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/li_Adding sub job'))
		
		//WebUI.click(findTestObject('Project Configuration/OR StandardTemplate/OR StandardTempTask/button_add_new_task'))
		
		//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/inputName'),
		//    'Adding task')
		//
		//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/button_Add'))
		
		WebUI.click(findTestObject('Project Configuration/OR StandardTemplate/OR StandardTempTask/button_dropdown_task'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/li_Adding task'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/inputName_1'),
			'Adding name')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/Cost Code'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/li_code1'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/Cost Code 1'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/li_code 1.1'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/Cost Type'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/li_Cost Type2'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/Base UOM'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/li_Testing UOM'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/inputQuantity'),
			'150')
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/inputUOM Unit Price'),
			'160')
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/inputPlanned Cost'),
			'128')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/span_mat-checkbox-inner-container mat-check_af9337'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/input_ng-tns-c329-52 p-autocomplete-input p_d51a47'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/li_Testing Status'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR StandardTempTask/button_Add_1'))
	}
	
	
	
	@Keyword
	def goto_add_standard_template() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/job/job-data/ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba/list?id=ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba&name=Standard%20Project')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
