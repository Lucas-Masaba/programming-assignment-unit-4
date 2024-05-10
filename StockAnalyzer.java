import java.util.ArrayList;

public class StockAnalyzer {
  public static void main(String[] args) {
    // Create an array of stock prices.
    float[] stockPricesArray = { 10.0f, 20.0f, 30.0f, 40.0f, 50.0f };
    // Create an ArrayList of stock prices.
    ArrayList<Float> stockPricesArrayList = new ArrayList<>();
    // Add the stock prices from the array to the ArrayList using a for loop.
    for (float stockPrice : stockPricesArray) {
      stockPricesArrayList.add(stockPrice);
    }
    // Print the average stock price, maximum stock price, occurrences of 11.2, and cumulative sum of the stock prices.
    System.out.println("Average Stock Price (Array): " + calculateAveragePrice(stockPricesArray));
    System.out.println("Maximum Stock Price (Array): " + findMaximumPrice(stockPricesArray));
    System.out.println("Occurrences of 11.2: " + countOccurrences(stockPricesArray, 11.2f));
    System.out.println("Cumulative Sum (ArrayList): " + computeCumulativeSum(stockPricesArrayList));
  }

  // Implement the calculateAveragePrice method.
  public static float calculateAveragePrice(float[] stockPrices) {
    // Initialize the sum variable to 0.
    double sum = 0;
    // Iterate over the stockPrices array and add each stock price to the sum.
    for(float stockPrice : stockPrices){
      sum += stockPrice;
    }
    // Calculate the average price by dividing the sum by the number of stock prices.
    double averagePrice = sum / stockPrices.length;
    // Return the average price as a float.
    return (float) averagePrice;
  }


  // Implement the findMaximumPrice method.
  public static float findMaximumPrice(float[] stockPrices){
    // Initialize the maxPrice variable to 0.
    float maxPrice = 0;
    // Iterate over the stockPrices array and update the maxPrice if a higher price is found.
    for(float stockPrice : stockPrices){
      if(stockPrice > maxPrice){
        maxPrice = stockPrice;
      }
    }
    return maxPrice;
  }


  // Implement the countOccurrences method.
  public static int countOccurrences(float[] stockPrices, float targetPrice){
    // Initialize the count variable to 0.
    int count = 0;
    // Iterate over the stockPrices array and increment the count if the targetPrice is found.
    for(float stockPrice : stockPrices){
      if(stockPrice == targetPrice){
        count++;
      }
    }
    return count;
  }

  // Implement the computeCumulativeSum method.
  public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPrices){
    // Create an ArrayList to store the cumulative sum of the stock prices.
    ArrayList<Float> cumulativeSum = new ArrayList<>();
    // Initialize the sum variable to 0.
    float sum = 0;
    // Iterate over the stockPrices ArrayList and calculate the cumulative sum.
    for(float stockPrice : stockPrices){
      sum += stockPrice;
      cumulativeSum.add(sum);
    }
    return cumulativeSum;
  }
}