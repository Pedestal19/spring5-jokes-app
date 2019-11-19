package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: jokeapp.
 * Date: 11/19/2019.
 */

//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
