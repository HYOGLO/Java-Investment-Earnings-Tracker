# Java Investment Earnings Tracker

A simple Java application to track stock earnings or losses per share based on daily closing prices.

## Description

The Stock Earnings Tracker allows users to input the buying price of a stock and then enter the daily closing prices to calculate the earnings or losses per share. It provides a straightforward way to monitor your stock performance over time.

## Features

- **User Input for Buying Price:** Enter the price per share that you are buying at.
- **Daily Closing Price Entry:** Enter the closing price for each day.
- **Earnings Calculation:** Automatically calculates the difference between the closing price and the buying price.
- **Formatted Output:** Displays earnings or losses per share, formatted to two decimal places.
- **Exit Option:** Allows users to exit the program by entering a negative value for the closing price.
- **Resource Management:** Closes the Scanner object to avoid resource leaks.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Running the Program

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/stock-earnings-tracker.git
    ```
2. Navigate to the project directory:
    ```bash
    cd stock-earnings-tracker
    ```
3. Compile the Java program:
    ```bash
    javac Driver.java
    ```
4. Run the program:
    ```bash
    java Driver
    ```

### Usage

1. When prompted, enter the buying price per share.
2. Enter the closing price for each day. The program will calculate and display the earnings or losses per share.
3. Enter a negative value to exit the program.

## Example

```plaintext
Enter your price per share that you are buying at: 
100.00
Enter the closing price for day 1. Enter any negative value to leave: 
105.00
After day 1, you earned 5.00 per share.
Enter the closing price for day 2. Enter any negative value to leave: 
98.00
After day 2, you lost 2.00 per share.
Enter the closing price for day 3. Enter any negative value to leave: 
-1
