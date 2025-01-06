### Project Overview
This project involves a Bluetooth Low Energy (BLE) client-server setup. The main components include:
1. **Main Activity**: Entry point of the app with options to start the BLE Server or Client activities.
2. **Server Activity**: Sets up a BLE server, advertises it, and handles incoming connections.
3. **Client Activity**: Scans for BLE servers, connects to a selected one, and interacts with it (reading characteristics, writing values).

### Testing the Project Using Two Devices
To test this project, you'll need two devices:
- **Device A**: Acts as the BLE Server.
- **Device B**: Acts as the BLE Client.

Here’s a step-by-step guide to test the setup:

#### Setup BLE Server on Device A
1. Install the app on Device A.
2. Open the app and select the "BLE Server Activity" option.
3. Grant the necessary permissions (Bluetooth, Location, etc.) if prompted.
4. Start the BLE server by clicking the "Start Server" button. The server should start advertising its presence.

#### Connect BLE Client on Device B
1. Install the app on Device B.
2. Open the app and select the "BLE Client Activity" option.
3. Grant the necessary permissions (Bluetooth, Location, etc.) if prompted.
4. Start scanning for BLE devices by clicking the "Start Scanning" button.
5. Once the server device (Device A) appears in the list, select it to connect.
6. After connecting, you can interact with the server by discovering its services, reading characteristics (e.g., password), and writing values (e.g., name).

### Steps to Ensure Functionality
- **Ensure Bluetooth is enabled**: On both devices, make sure Bluetooth is turned on.
- **Close proximity**: Keep both devices close to each other to ensure a stable BLE connection.
- **Monitor logs**: Use logcat in Android Studio to monitor the logs for any issues or errors during the connection and communication process.
- **Permissions**: Verify that all necessary permissions are granted, as BLE operations often require specific permissions like `BLUETOOTH_CONNECT`, `BLUETOOTH_SCAN`, and location access.

### Feature Work: Refactoring and Enhancements

For future improvements, the project can be refactored and enhanced using the following techniques:

1. **Refactor to MVI (Model-View-Intent) Architecture**  
2. **Implement Clean Architecture**  
3. **Integrate Hilt for Dependency Injection**  

