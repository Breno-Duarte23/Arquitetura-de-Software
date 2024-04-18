package buttons;

/**
 * Abstract Factory assume que voc� tem v�rias fam�lias de produtos, 
 * estruturados em hierarquias de classes separadas (Button/Checkbox).
 * Todos os produtos da mesma fam�lia possuem a interface comum. 
 *  
 * Esta � a interface comum para a fam�lia de bot�es.
 */
public interface Button {
    void paint();
}