# Server Push Exercise

## Running the application

```
git clone https://github.com/alejandro-du/push-exercise.git
cd push-exercise
mvn
```

## The problem

The application shows a button to generate a new report and a button to check the current time on the server. If you click the *Generate report* button you have to wait for some seconds before the report appears and you cannot use the *What time is it?*" button. In a real-world application, you could find a similar situation–an UI interaction that takes too long and doesn't allow the user to execute other functionality in the application. This is not the best UX you can give with Vaadin.

## The challenge

Your taks is to improve the usability of the application by showing a message to tell the user that the report is being generated when the *Generate report* button is clicked. However, the user should be able to continue to use the *What time is it?* button and get the time reported in the browser imediatelly after the click event, even while the report is being generated. Once the report is generated, you have to remove the temporary message and show the report in the UI.

Happy coding!
