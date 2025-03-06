# Amazon Automation with Selenium

This project demonstrates automated browser testing for Amazon using Selenium WebDriver with Java. The automation script performs a series of actions on Amazon India's website, including navigating to product pages, adding items to cart, and manipulating cart quantities.

## Project Overview

The automation flow includes:
1. Opening Amazon India website
2. Navigating to "Today's Deals"
3. Selecting OPPO phone deals
4. Adding OPPO A31 to cart
5. Navigating to cart and changing quantity
6. Finding and adding another phone (OPPO A54) to cart

## Prerequisites

- Java 8
- Maven
- Chrome browser
- ChromeDriver (matching your Chrome version)

## Setup and Configuration

1. Clone this repository:
   ```
   git clone https://github.com/your-username/amazon-automation.git
   cd amazon-automation
   ```

2. ChromeDriver configuration:
   - Download ChromeDriver from [ChromeDriver website](https://sites.google.com/chromium.org/driver/)
   - Place it in your preferred location
   - Update the path in `Amazon3.java` if needed:
     ```java
     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
     ```

3. Build the project:
   ```
   mvn clean install
   ```

## Running the Tests

To run the automation script:

```
mvn exec:java -Dexec.mainClass="Amazon3"
```

## Project Structure

```
amazon-automation/
├── .idea/                    # IntelliJ IDEA configuration files
├── src/
│   └── main/
│       └── java/
│           └── Amazon3.java  # Main automation script
├── pom.xml                   # Maven configuration file
└── README.md                 # Project documentation
```

## Dependencies

- Selenium WebDriver (v4.1.2)
- TestNG (latest release)

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
