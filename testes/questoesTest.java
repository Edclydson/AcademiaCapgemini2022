import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
    
public class questoesTest 
{
    /**
    * Teste unitário  para a questão 2
    */
    class MainTest 
    {
        /**
        * Rigorous Test.
        */
        @Test
        void testmain() 
        {
            Senha pass = new Senha();
            pass.setSenha("Ya3&ab");
            String efort = questao2.senhaSegura(pass.getSenha());
            assertEquals("Senha Forte", efort);   
        }
    }
    /**
    * Teste unitário para a questão 3
    */
    class anagramaTest
    {
        /**
        * Rigorous Test.
        */
        @Test
        void testanagrama()
        {
            String palavra = "oi";
            ArrayList<String> lista = new ArrayList<>();
            lista = questao3.dividePalavra(palavra);
            int qtdanagram = questao3.detectaAnagrama(lista);
            assertEquals(0, qtdanagram);
        }
    }
    
}
