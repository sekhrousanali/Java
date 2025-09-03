 // Simulating an asynchronous operation
    // setTimeout(() => {
    // }, 2000); // Simulated delay of 2000 milliseconds

    const myPromise = new Promise((resolve, reject) => {
      const isSuccess = false; // Simulated success flag
      if (isSuccess) {
        resolve("Operation completed successfully."); // Resolve the promise with a value
      } else {
        reject("Operation failed."); // Reject the promise with a reason
      }
    
  });
  
  myPromise
    .then(result => {
      console.log("Fulfilled:", result);
    })
    .catch(error => {
      console.log("Rejected:", error);
    })
    .finally(() => {
      console.log("Promise completed.");
    });
  