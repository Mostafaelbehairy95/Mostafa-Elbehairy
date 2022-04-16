# Test Plan
<br/>

## Scope
### Testing of Yall Korra is in the scope of this test plan. The following components and functions would be tested
<br/>
#### Home Page (الرئيسية) 
* ensure the user can scroll news left/right and dots will be updated based on news index
* User can navigate to specific Championships that appears on home page
* User can navigate to specific match that appears on home page
* User can see all Matches by clicking on (كل المباريات)
* User can see all news by clicking on (كل الاخبار)
* ensure all matches order based on date of today
* ensure all news order based on date of today

#### Matches (مباريات)
* User can open & close (كل المباريات) 
* User can scroll When opening (كل المباريات)
* user can filter result base on weekDay
* ensure all Championship on page is the same in list (كل المباريات)
* user can see more details on specifc Championship
* user can seemore details on specifc matche
* user can scroll page to see more matches
* check user can preivew the live matches now
#### Filter
* check user can filter using specific date
* set date filter to date in past to check what will appear to user
* ensure filter doesn't change if user move to another page
* ensure user can use filter if he come from any page

#### Championships (بطولات)
* user can scroll to see all Championships
* More details will apear to user by clicking on specific Championships
* user can scroll horizontal to see more details like (الترتيب, المباريات, الاحصائيات, الاخبار) in specific Championship
* ensure all categories (الترتيب, المباريات, الاحصائيات, الاخبار) have data 
* user can navigate to specific team that appears in (الترتيب) to see more details
* user can see more details on specifc match when he clicks on it through (المباريات)
* user can see (كل الهدافين) by clicking on it throguh (الاحصائيات)
* user can see (كل صانعى الاهداف) by clicking on it throguh (الاحصائيات)
* user can see more news about Championships by navigate to (الاخبار)

#### Your Teams (فرقك)
* user can add new team by clicking on (أضف فريقك)
* ensure all favourite Teams will appear in this page
* user can navigate to team page by clicking on team name
* user can see more details on specific match for his favourite team
* user can edit his favourite list by clicking on delete icon then clicking on back icon that appears on page
* user can edit his favourite list by clicking on delete icon then clicking on back in his mobile
* user can add new favourite team by clicking on plus icon

#### News (اخبار)
* ensure the user can scroll news left/right and dots will be updated based on news index in (اخر الاخبار)
* ensure the user can scroll news left/right and dots will be updated based on news index in (رياضات اخرى)
* User will be navigate to another page by clicking on specific news
* user can share news with his friends
* user scroll up and down
* ensure new news loads when user scroll to end of page
* check the related news is matched with the current news page
* user can navigate to news that related to current news
* Ensure news is ordered by date (from newest date to old date)

#### Team page 
* user can add this team as favourite by clicking on plus icon
* user can remove this team from favourite list by clicking on star icon
* user can swipe left and righ to see more catogires like (أخبار, الترتيب, مواعيد المباريات, النتائج, انتقالات, احصائيات, اللاعبيين)
* when catogry (الاخبار) is opened, user can open any news
* ensure more news appears when user scroll to end of category (الاخبار) page
* ensure order of team is correct when user open catogry (الترتيب)
* user can see all Championships that team is enrolled in it when user open catogry (الترتيب)
* user can filter by Championships when user open catogry (الترتيب)
* user can see all Championships that team is enrolled in it when user open catogry (مواعيد المباريات)
* user can filter by Championships when user open catogry (مواعيد المباريات)
* user can preview more details when clicking on match which appears in  catogry (مواعيد المباريات)
* ensure matches are order by nearest date

#### Match page
* Ensure user can access team page by clicking on team image
* User can scroll horizontal to see more category like (ملخض, التشكيل, دقيقة بدقيقة)
* user can see teams order when clicking on (ملخص)
* user can line-up for each team when clicking on (التشكيل)
* ensure data of match appear when match is live. when user click on (دقيقة بدقيقه)

#### Notifications
* user will be redirect to news page when clicking on notification in notification center
* if user open old news, he will be redirect to new news by clicking on it from notification center
* try to click on notification while internet is closed
* try to access notification again after reopening internet

###Search
* user can search on team
* user can search on national teams
* user can click on the results that appears to choose team
* search result will be deleted if user go to another page 


## Schedule
The parties agreed to follow the next work plan:
1. Test plan preparation
2. Test plan approval
3. Functional testing and bugs reporting

## Test Plan and Strategy
The objective of functional testing is to make sure that the whole software product works
according to the requirements, and no significant errors appear in the application.
### Technique
Execute each use case, use-case flow, or function, using valid and
invalid data, to verify the following:
* The expected results occur when valid data is used.
* The appropriate error or warning messages are displayed when
invalid data is used.

### Entry Criteria
* The application construction is completed.
* Necessary devices, instruments, and other equipment are acquired.
* Test environment is prepared, and the application is released to the
test environment.

### Completion Criteria:
* All the planned tests are performed.
* There are no show-stopping errors.
* All the errors of high priority and severity are fixed.
* The test results are evaluated, discussed and approved.

## Test Procedure
The main testing types that would be executed:
* Functional Testing
* UI Testing
* Usability Testing
* Regression testing



