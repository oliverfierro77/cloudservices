package corp.sodimac;

import java.net.URI;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import corp.sodimac.service.Reserva;

public class ReservaClient {

    /*public void getArticleByIdDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/article/{id}";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Article> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Article.class, 1);
        Article article = responseEntity.getBody();
        System.out.println("Id:"+article.getArticleId()+", Title:"+article.getTitle()
                 +", Category:"+article.getCategory());      
    }*/
    
    public void getAllReservasDemo() {
	HttpHeaders headers = new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/reservas";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<Reserva[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Reserva[].class);
        Reserva[] reservas = responseEntity.getBody();
        for(Reserva reserva : reservas) {
              System.out.println("Número Reserva:"+reserva.getNumReserva());
        }
    }
    
    /*public void addArticleDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/article";
	Article objArticle = new Article();
	objArticle.setTitle("Spring REST Security using Hibernate");
	objArticle.setCategory("Spring");
        HttpEntity<Article> requestEntity = new HttpEntity<Article>(objArticle, headers);
        URI uri = restTemplate.postForLocation(url, requestEntity);
        System.out.println(uri.getPath());    	
    }*/
    
    /*public void updateArticleDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/user/article";
	Article objArticle = new Article();
	objArticle.setArticleId(1);
	objArticle.setTitle("Update:Java Concurrency");
	objArticle.setCategory("Java");
        HttpEntity<Article> requestEntity = new HttpEntity<Article>(objArticle, headers);
        restTemplate.put(url, requestEntity);
    }*/
    
    /*public void deleteArticleDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080/user/article/{id}";
        HttpEntity<Article> requestEntity = new HttpEntity<Article>(headers);
        restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, 4);        
    }*/
    
    public static void main(String args[]) {
    	ReservaClient util = new ReservaClient();
        //util.getArticleByIdDemo();
    	util.getAllReservasDemo();
    	//util.addArticleDemo();
    	//util.updateArticleDemo();
    	//util.deleteArticleDemo();
    }

} 