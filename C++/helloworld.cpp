#include "CImg.h"
#include <iostream>

using namespace cimg_library;

int main() {
    try {
        CImg<unsigned char> imagen("imagen.bmp"); 

        CImgDisplay ventana(imagen, "Mi Imagen");

        while (!ventana.is_closed()) {
            ventana.wait();
        }
    }
    catch (CImgException& e) {
        std::cerr << "Error al cargar la imagen: " << e.what() << std::endl;
        return -1;
    }

    return 0;
}