I've made this app for Israel's Sports channel - Sport 5.

# Android-TV-Volume-Raiser
A simple app made with Kotlin to keep AndroidTV from turning off every 3 hours.

This app will run in the background and mimic a person pressing the volume up button every 2 hours.

Installation:
Open cmd/terminal in the adb directory.
type .\adb connect [your device's ip address]
press Enter
(this step will happen twice.
first time : 
will show failed and on the TV screen will ask for premission to trust the computer
second time :
will show "Connected to [Device's IP Address]

type .\adb devices to confirm your are connected to the device
press Enter

type .\adb install [/path/to/file.apk]
after installation is completed go to your device
Settings
Apps
Volume Raiser For Sport 5
open

and you can then minimize the app while keeping it open in the background and never worry about your tv auto sleep again :)

*This app was buily by Idan Magor for Sport 5 Channel in Israel and is free to use for everyone who wants it


