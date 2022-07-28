#Improvements and known problems

##Tests
 * A web hoock could be set up to lunch test on new commits.

###Test samples
 * `org.aiotml.testjar.RunCustomTests` already allows to run custom tests, but it relies on properties files for each test. Some properties file could be written (or generated) in order to test samples and check than no outdated samples are hosted on the repo.

###Network Tests
 * Lack some distributed network tests.
 * MQTT tests send/receive topic should be separated to obtain clean results.

###Test Results
 * Results summary could display the specific step which failed when a test has failed.

##Network plugins
 * SSL should be used as much as possible for MQTT, Websocket, etc
 * Automatic reconection, and/or connection loss notification should be used by network plugins.
 * C plugins Websocket and MQTT rely on library which API migh have changed.

###MQTT
 * C plugin lacks separated send/receive topics.

##AiotML protocol refactoring
 * Protocol could be replaced by things without statechart which behaviour would be generated. Ex: `thing myThing generated by myPlugin { ... }`
 * debugGUI compiler could be refactor as a plugin.