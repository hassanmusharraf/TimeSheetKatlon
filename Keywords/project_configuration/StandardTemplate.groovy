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
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
	}



	@Keyword
	def add_task() {

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
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
	}



	@Keyword
	def add_settings() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/a_Settings'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		// adding shift
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/a_Settings'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/button_add Add New'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/input_ng-tns-c329-69 p-autocomplete-input p_752813'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/li_Afternoon'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/start_time'),'1150A')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/end_time'),'0750P')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/button_Add'))



		// adding overtime
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/button_add_new_overtime'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/Hours for Job'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/li_Travel Time'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/inputApplicable Hours'),
				'12')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/button_Add'))



		// adding wordays
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/monday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/tuesday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/wednesday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/thursday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/friday'))


		// adding Asbestos Containment
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/button_add Add'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/input_ng-tns-c329-69 p-autocomplete-input p_752813'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/li_Testing Asbestos'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Settings/button_save Save Changes'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
	
	
	@Keyword
	def add_resource() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		// add users
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/a_Resources'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/button_add Add New'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/div_group'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/Button Job Title'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_Project Manager  Sample Organization'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/Users'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_Shanta Paul'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/button_Add'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		
		// add fleet
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/button_add Add New'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/div_construction'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/Fleet Template'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_Standard Fleet'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/Equipments'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_eqp 1234  equipment name 1'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/Job Title'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_Project Manager  Sample Organization'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/Operator'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_Shanta Paul'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/button_Add'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
	}

	
	
	@Keyword
	def goto_standard_template() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/job/job-data/ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba/list?id=ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba&name=Standard%20Project')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	

	@Keyword
	def goto_project() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/job/job-data/ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba/list?id=ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba&name=Standard%20Project')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		Components.search_element('Adding name')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/row-update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
