package com.generic;

public class ObjectRepository {
	static String BuyNowLink = "CSS=a[data-tracking-value='shk:home:gn:buy-now']";
	static String PackagingSizeDropDown = "CSS=select[class='package']";
	static String OrderDropDown = "CSS=select[class='order']";
	static String AddToCartButton = "CSS=button[data-track='add-to-cart']";
	static String CheckOut = "CSS=a[data-track='cart']";
	static String CheckoutMain = "checkoutButton";
	static String EmailAddress = "CSS=input[placeholder='Email']";
	static String Password = "CSS=input[placeholder='Password']";
	static String LoginButton = "CSS=input[value='Login']";
	
	// Reach to signup page
	static String NotAMember = "CSS=li[class='not-a-member'] > a";
	static String FreeMemberSignupLink = "CSS=img[alt='Sign me up for FREE membership']";
	
	// Free Sign up Page General Information
	static String FirstName = "id=loginForm.firstName";
	static String LastName = "id=loginForm.lastName";
	static String EmailId = "id=emailForm.email";
	static String ConfirmEmailId = "id=emailForm.confirmEmail";
	static String passwordFree = "id=<portlet:namespace />password";
	static String ConfirmPasswordFree = "id=<portlet:namespace />confirmPassword2";
	static String ScreenName = "ID=screenName";
	static String BirthdayMonthDropdown = "id=_TBBSIGNUP_WAR_signuprefactorportlet_birthdayMonth";
	static String BirthdayDayDropdown= "id=_TBBSIGNUP_WAR_signuprefactorportlet_birthdayDay";
	static String BirthdayYearDropdown= "id=_TBBSIGNUP_WAR_signuprefactorportlet_birthdayYear";
	
	// Shipping Address objects
	static String Address1 = "shippingAddressForm.street1";
	static String Address2 = "shippingAddressForm.street2";
	static String ShippingCity = "id=shippingAddressForm.city";
	static String ShippingState = "id=addressRegionId";
	static String ShippingZipCode = "id=shippingAddressForm.postalCode";
	static String ShippingCountry = "id=addressCountryId";
	
	// Coach Referral Section
	static String DefaultCoach = "id=defaultCoach";
	static String SelectCoach = "id=coachSelectedInput";
	static String CoachLookUpType = "id=coachLookupType";
	static String CoachSearchField = "id=coachSearchField";
	static String ConfirmCoachButton = "id=_TBBSIGNUP_WAR_signuprefactorportlet_lookupCoachBtn";
	static String CoachSelectedMessage = "CSS=span[id='_TBBSIGNUP_WAR_signuprefactorportlet_coachSelectedMessage'] > span";
	
	// Term and Condition with Captcha
	static String DefaultTC = "id=termsAndConditionsForm.termsAndConditionsAgree1";
	static String CASLTC = "id=termsAndConditionsForm.canadaOptIn1";
	static String CASLText = "CSS=div[id='tncText']";
	static String CaptchaInputBox = "css=input[name='_TBBSIGNUP_WAR_signuprefactorportlet_captchaText']";
	static String SubmitFreeButton = "id=free_submit";
	static String SubmitClubButton = "id=club_submit";
	
	// After Signup Title Header
	static String SignupHeaderTitle = "CSS=h3[class='title']";
	
	
	
	
	static String StartUpLogo = "//img[contains(@src,'PCS_logo.gif')]";
	static String loginUserName = "username";
	static String loginOrgnaizationName = "orgname";
	static String loginPassword = "password";
	static String loginButton = "//input[@class='sgButtonDark'][@value='Login']";
	
	// Portbase Port Community System Page after Login
	static String RoadPlanningLink = "eri.road.prenotification.roadhaulier.overview";
	
	// Road Planning Page 
	static String AddRoadPlanLink = "LINK=Add";
	static String OverviewRoadPlanLink = "LINK=Overview";
	
		// Add Page objects:
		static String TerminalDropdown = "locationId";
		static String PreNotificationTypeDropDown = "prenotificationType";
		static String ShippingCompanyNameDropdown = "carriers";
		static String ContainerNumberInputBox = "CSS=[name='containerNumber']";
		static String AcceptedReferenceNumberInput = "orderAcceptanceReferenceCode";
		static String EstimatedArriavelDateInput = "estimatedArrivalDate";
		static String EstimatedArriavelTimeInput = "CSS=input[name='estimatedArrivalTime']";
		static String SizeTypeMagnifierLink = "//div[@id='sizeType']/img";
		static String DangerousGoodArrowImage = "dangerousGoodsBlock_image";
		static String DeleteDangerousGoodsImage = "CSS=[name='verwijderen_7']";
		static String DangerousGoodUNCodeInput = "unCode";
		static String AddGoodsButton = "CSS=input[value='Add goods']";
		static String DangerouGoodMagnifierImage = "imdgitemimagelov";
		static String PreNotificationSaveButton = "CSS=[value='Save']";
		
			// Container Type Window Objects
			static String ContainerTypeFindButton = "CSS=input[value='Find']";
			static String FirstContainerTypeValue = "//td[@onclick='top.opener.chooseLovValue(this); top.close();']";
		
			// Dangerous Good Window Objects
			static String GoodsFindButton = "CSS=input[value='Find']";
			static String FirstGoodsValue = "//td[@onclick='top.opener.chooseLovValue(this); top.close();']";
			static String GoodsSearchWindowCloseButton = "CSS=input[value='Close window']";
}
