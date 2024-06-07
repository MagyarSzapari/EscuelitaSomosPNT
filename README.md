# EscuelitaSomosPNT

## Consigna
  La misma puede encontrarse en el pdf adjunto dentro del repositorio bajo el nombre de "Ejercicio Escuelita Somos PNT.pdf".

## Justificaciones de Diseño
  Comencé creando una clase abstracta Producto que permita englobar atributos y posibles métodos futuros que compartan todos los productos del supermercado.
Para desarrollar las subclases de Producto, contemplé en qué categoría de producto entrarían los productos solicitados. Es por eso que creé las clases Bebida, CosmeticaEHigiene y Fruta. En ellas, agregué los atributos que consideré necesarios y sobreescribí el método toString(), que luego utilizaré para mostrar la información pedida.
  Como fue solicitado, me encargué de que la clase abstracta Producto implementace la interfaz Comparable<Producto>, haciendo que cada subclase de Producto sobreescriba el método compareTo(). De esta forma, me fue posible obtener tanto el producto más caro como el más barato de la lista.
  Finalmente, para mostrar en pantalla lo solicitado, utilizo el método println() dentro de un foreach, lo que me permite mostrar toda la lista de productos (utilizando el método toString previamente sobreescrito) sin importar cuántos productos haya. Luego, imprimo tanto el producto más caro como el más barato, separados como se muestra en la consigna.

## UML de la Solución
  ![UMLEscuelitaSomosPNT](https://github.com/MagyarSzapari/EscuelitaSomosPNT/assets/156636214/b3645b34-df7c-4a5e-8796-50ecde4ef02e)
