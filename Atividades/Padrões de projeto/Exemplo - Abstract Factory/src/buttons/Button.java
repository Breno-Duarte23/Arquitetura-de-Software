package buttons;

/**
 * Abstract Factory assume que você tem várias famílias de produtos, 
 * estruturados em hierarquias de classes separadas (Button/Checkbox).
 * Todos os produtos da mesma família possuem a interface comum. 
 *  
 * Esta é a interface comum para a família de botões.
 */
public interface Button {
    void paint();
}