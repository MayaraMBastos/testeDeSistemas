package Teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testes {
    private WebDriver driver;

    // Inicializar metodos base
    @BeforeMethod
    public void iniciar(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aluno\\Desktop\\testesSistemas\\chromedriver_win32\\chromedriver.exe");


    }

    @Test
    public void testarPaginaHome(){
        driver.get("https://demo.automationtesting.in/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("email@email.com");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("may@email.com");
        //Thread.sleep(5000);
        driver.findElement(By.id("enterimg")).click();

        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Mayara");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Martinello");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Rua Xavantes, 900");
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("email@email.com");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("55 44 12345-1234");

        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();

//        driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"country\"]/option[7]")).click();

        Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        skill.selectByVisibleText("Android");

        Select ano = new Select(driver.findElement(By.id("yearbox")));
        ano.selectByVisibleText("1991");

        Select mes = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
        mes.selectByVisibleText("July");

        Select dia = new Select(driver.findElement(By.id("daybox")));
        dia.selectByVisibleText("22");

        driver.findElement(By.id("firstpassword")).sendKeys("senha");
        driver.findElement(By.id("secondpassword")).sendKeys("senha");




    }

    @Test
    public void testarLoginInvalido() {

        // Abrir a URL informada
        driver.get("https://demo.automationtesting.in/");

        // Clicar em elementos como botões ou links
        driver.findElement(By.xpath("XPATH")).click();

    }

// Finalizar teste e fechar o navegador
        @AfterMethod
        public void finalizar() throws InterruptedException {
            Thread.sleep(5000); // aguarda 5 segundos e fecha o navegador
            // Esse metodo irá fechar o navegador
            driver.quit();
        }

    }
