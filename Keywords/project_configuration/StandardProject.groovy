package project_configuration

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.Components
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class StandardProject {
	@Keyword
	def add_project_detail() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/job/job-data/ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba/list?id=ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba&name=Standard%20Project')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/button_add Add Job Data'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputProject Number'), 'TPJ001')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputProject Name'), 'Adding name')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputProject Short Description'),
				'Desc')

		Components.getTodaysDate()

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/project_start_date'), GlobalVariable.TODAYS_DATE)

		Components.getCustomDate(30)

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project_End_Date'), GlobalVariable.DATE)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/div_Project NumberProject NameProject Short_4edab2'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputClient Number'), '001')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputClient Name'), 'Client XYZ')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project Manager'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Shanta Paul  shanta.paulqm.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project Administrator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Emp 5  emp5gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project Coordinator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/span_Emp 1  emp1gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Site Supervisor'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Meenaz Momin  meenazmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/WIP Method'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Job WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Job Union Code'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_U001'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputDaily LOA Amount Selection'),
				'555')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Country'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Nepal'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Province'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Bheri Zone'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Division'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_101  Hazmat'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Region'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_111  region name'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Location'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_101  Richmond BC'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Department'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_102  Operations Management'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/button_Save'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}



	@Keyword
	def update_project_detail() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/row-update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputProject Number'), 'TPJ002')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputProject Name'), 'updating name')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputProject Short Description'),
				'updating Desc')

		Components.getCustomDate(30)

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/project_start_date'),GlobalVariable.DATE)

		Components.getCustomDate(60)

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project_End_Date'), GlobalVariable.DATE)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/div_Project NumberProject NameProject Short_4edab2'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputClient Number'), '002')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputClient Name'), 'Updating Client XYZ')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project Manager'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/updating_template/li_Emp 2  emp2gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project Administrator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/updating_template/li_Emp 5  emp5gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Project Coordinator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/span_Emp 1  emp1gmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Site Supervisor'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Meenaz Momin  meenazmail.com'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/WIP Method'))

		//		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/WIP_Method_li2'))


		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Job WCB'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Testing WCB'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Job Union Code'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_U001'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/inputDaily LOA Amount Selection'),
				'666')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Country'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Nepal'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Province'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_Bheri Zone'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Division'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_101  Hazmat'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Region'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_111  region name'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Location'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_101  Richmond BC'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/Department'))

		//		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/li_102  Operations Management'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/second_element_of_dropdown'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/button_Save'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}



	@Keyword
	def add_task() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/a_Tasks'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/button_add Add New'))

		WebUI.delay(2)

		//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/button_add_new_subtask'))
		//
		//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/inputName'),
		//    'Adding sub job')
		//
		//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/button_Add'))

		//WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/button_'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/li_Adding sub job'))

		//WebUI.click(findTestObject('Project Configuration/OR StandardProject/OR StandardTempTask/button_add_new_task'))

		//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/inputName'),
		//    'Adding task')
		//
		//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/button_Add'))

		WebUI.click(findTestObject('Project Configuration/OR StandardProject/OR StandardTempTask/button_dropdown_task'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/li_Adding task'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/inputName_1'),
				'Adding name')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/Cost Code'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/li_code1'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/Cost Code 1'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/li_code 1.1'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/Cost Type'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/li_Cost Type2'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/Base UOM'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/li_Testing UOM'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/inputQuantity'),
				'150')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/inputUOM Unit Price'),
				'160')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/inputPlanned Cost'),
				'128')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/span_mat-checkbox-inner-container mat-check_af9337'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/input_ng-tns-c329-52 p-autocomplete-input p_d51a47'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/li_Testing Status'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/button_Add_1'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_task() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR StandardTempTask/a_Tasks'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/buttonrow-update'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/button_Add New'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/inputName'),'Updating Sub Task')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/button_Add'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/Sub Job'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/li_Updating Task'))





		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/button_Add New_1'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/inputName'),
				'Updating Task')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/button_Add'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/Task'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/li_Updating Task'))







		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/inputName_1'),
				'Updating name')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/Cost Code 1'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/li_asdfg'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/Cost Type'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/li_Testing Cost Type'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/Base UOM'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/li_Month'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/inputQuantity'),
				'1.00')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/inputUOM Unit Price'),
				'16')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/inputTotal Amount'),
				'13')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/inputPlanned Cost'),
				'12')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/span_mat-checkbox-inner-container mat-check_af9337'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/Status'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/li_vb'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR UpdatingStandardProjectTask/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}



	@Keyword
	def add_settings() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/a_Settings'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		// adding shift
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/a_Settings'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/add-new-shift'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/input_ng-tns-c329-69 p-autocomplete-input p_752813'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/li_Afternoon'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/start_time'),'1150A')

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/end_time'),'0750P')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/button_Add'))



		// adding overtime
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/button_add_new_overtime'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/Hours for Job'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/li_Travel Time'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/inputApplicable Hours'),
				'12')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/button_Add'))



		// adding wordays
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/monday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/tuesday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/wednesday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/thursday'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/friday'))


		// adding Asbestos Containment
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/button_add Add'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/input_ng-tns-c329-69 p-autocomplete-input p_752813'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/li_Testing Asbestos'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/button_Add'))

		WebUI.delay(3)

		WebUI.executeJavaScript('window.scrollTo(0, -document.body.scrollHeight);', null)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.delay(3)

		WebUI.executeJavaScript('window.scrollTo(0, -document.body.scrollHeight);', null)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Settings/button_save Save Changes'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}



	@Keyword
	def add_resource() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		// add users
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/a_Resources'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/button_add Add New'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/div_group'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/Button Job Title'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/li_Project Manager  Sample Organization'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/Users'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/li_Shanta Paul'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)


		// add fleet
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/button_add Add New'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/div_construction'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/Fleet Template'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/li_Standard Fleet'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/Equipments'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/li_eqp 1234  equipment name 1'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/Job Title'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/li_Project Manager  Sample Organization'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/Operator'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/li_Shanta Paul'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR Resource/button_Add'))

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

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardProject/OR ProjectDetail/row-update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
