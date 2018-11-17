# curl-java
Basic Java CURL. "Get" requests only.
***
### 1. Cloning the repo
```bash
git clone https://github.com/thatnickdev/curl-java/
```
### 2. Import to your project
![Add Project](https://i.imgur.com/8ZGQd96.png)
### 3. Use the class
```java
package javaapplication;

import curl.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication {

    public static void main(String[] args) {
        CURL request = new CURL("URL");
        try {
            System.out.println(request.getResponse());
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication22.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
```
### 4. Need Help?
- Open an [issue](https://github.com/thatnickdev/curl-java/issues).
- Open a [pull request](https://github.com/thatnickdev/curl-java/pulls).
