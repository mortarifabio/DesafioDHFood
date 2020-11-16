package com.mortarifabio.dhfoods.model.home

import com.mortarifabio.dhfoods.model.Dish
import com.mortarifabio.dhfoods.model.DishList
import com.mortarifabio.dhfoods.model.Restaurant
import com.mortarifabio.dhfoods.model.RestaurantList

open class HomeRepository {
    fun getRestaurants(): RestaurantList {
        return RestaurantList(
            listOf(
                Restaurant(
                    1,
                    "Tony Roma's",
                    "https://static-images.ifood.com.br/image/upload//capa/2d208204-b928-4236-b152-5061ac0bf780/202005291204_vxm3_c@2x.png",
                    "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                    "22:00",
                    listOf(
                        DishList(
                            1,
                            "Antipasti",
                            listOf(
                                Dish(
                                    1,
                                    "Insalata parma",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/c2d6b1aa-0971-4f33-8c62-a0e14a3f8887/201912261238_B8um_i.jpg",
                                    "Folhas verdes, lascas de presunto cru crocante e cogumelos salteados no alho e óleo com croutons de pão e parmesão"
                                ),
                                Dish(
                                    2,
                                    "Insalata verde con prosciutto",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/c2d6b1aa-0971-4f33-8c62-a0e14a3f8887/201912261235_WzAx_i.jpg",
                                    "Salada verde com presunto cru, figos, torradinhas de queijo de cabra gratinado, molho de aceto balsâmico e mel"
                                )
                            )
                        ),
                        DishList(
                            2,
                            "La carne",
                            listOf(
                                Dish(
                                    3,
                                    "Filetto alla parmigiana",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/c2d6b1aa-0971-4f33-8c62-a0e14a3f8887/201912261219_njQQ_f.jpg",
                                    "Filé mignon à parmegiana tradicional acompanhado de arroz branco, batatas fritas ou purê de batatas."
                                ),
                                Dish(
                                    3,
                                    "Saltimbocca alla romana",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/c2d6b1aa-0971-4f33-8c62-a0e14a3f8887/201912261214_buMJ_s.jpg",
                                    "Escalope de mignon com presunto cru e sálvia acompanhado de risoto de queijo parmesão."
                                )
                            )
                        ),
                        DishList(
                            3,
                            "La Pasta",
                            listOf(
                                Dish(
                                    5,
                                    "Gnocchi alle bolognese famiglia",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/2d208204-b928-4236-b152-5061ac0bf780/202008051407_xzcS_g.jpg",
                                    "Nhoque de batatas com molho tradicional à bolonhesa. Serve 2 pessoas."
                                ),
                                Dish(
                                    6,
                                    "Penne alla vodka con salmone famiglia",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/2d208204-b928-4236-b152-5061ac0bf780/202008051408_uLkb_p.jpg",
                                    "Penne com salmão fresco puxado na vodka ao molho rosé. Serve 2 pessoas."
                                ),
                                Dish(
                                    7,
                                    "Penne al limone famiglia",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/2d208204-b928-4236-b152-5061ac0bf780/202008051408_cE0B_p.jpg",
                                    "Penne com molho de limão siciliano e presunto cru. Serve 2 pessoas."
                                )
                            )
                        ),
                        DishList(
                            4,
                            "Sobremesas",
                            listOf(
                                Dish(
                                    8,
                                    "Pudim de leite",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/c2d6b1aa-0971-4f33-8c62-a0e14a3f8887/201912261243_xrMA_p.jpg",
                                    "Delicioso pudim de leite"
                                )
                            )
                        )
                    )
                ),
                Restaurant(
                    2,
                    "Aoyama - Moema",
                    "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
                    "Alameda dos Arapanés, 532 - Moema, São Paulo",
                    "00:00",
                    listOf(
                        DishList(
                            1,
                            "Entradas",
                            listOf(
                                Dish(
                                    1,
                                    "Guioza",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130037_03gui.jpg",
                                    "Fina massa frita recheada com carne bovina e legumes ( 8 unidades)"
                                ),
                                Dish(
                                    2,
                                    "Ceviche",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130056_66cev.jpg",
                                    "Salmão e peixe branco em cubos, cebola roxa, rúcula, coentro, limão, hondashi e Saquê"
                                ),
                                Dish(
                                    3,
                                    "Shimeji na chapa",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130038_06shi.jpg",
                                    "Cogumelos salteados com shoyu,manteiga,ajinomoto,Saquê e cebolinha"
                                ),
                                Dish(
                                    4,
                                    "Aguedashi tofu",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130037_02agu.jpg",
                                    "Cubos de tofu empanados e fritos ,servidos com molho"
                                )
                            )
                        ),
                        DishList(
                            2,
                            "Combinados",
                            listOf(
                                Dish(
                                    5,
                                    "Combinado 1",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/162c348e-eaad-4327-9461-1ebe080b50b1/201904261209_zc5x_e.jpg",
                                    "3 sashimis de salmão, 2 niguiris de salmão, 2 niguiris de atum, 2 jows de salmão, 2 hot rolls de salmão, 2 uramakis de salmão e 2 hossomakis de salmão"
                                ),
                                Dish(
                                    6,
                                    "Combinado 2",
                                    "https://static-images.ifood.com.br/image/upload/t_thumbnail/pratos/162c348e-eaad-4327-9461-1ebe080b50b1/201904261210_uJJ6_e.jpg",
                                    "Shimeji 100 gramas, salmão grelhado 100 gramas, 2 haromaki de queijo, 2 camarões empanados, 2 bolinhos exóticos"
                                )
                            )
                        ),
                        DishList(
                            3,
                            "Pratos",
                            listOf(
                                Dish(
                                    7,
                                    "Soba",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130103_soba2.jpg",
                                    "Macarrão yakissoba japonês com vegetais,camarão e molho tonkatsu levemente picante servido na chapa."
                                ),
                                Dish(
                                    8,
                                    "Temaki Salmão Completo",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130045_10tem.jpg",
                                    "Com maionese ou cream cheese e cebolinha"
                                ),
                                Dish(
                                    9,
                                    "Hot roll de salmão ( 8 unidades )",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130049_hotho.jpg",
                                    "Roll empanado e frito com recheio de salmão e molho teriyaki"
                                ),
                                Dish(
                                    10,
                                    "Sashimi kiichi ( 20 unidades )",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/122b475b-e83f-46fe-8df4-88eec2853a1d/201903130056_sashi.jpg",
                                    "Mix de sashimi: atum, salmão, peixe branco e polvo em fatias"
                                ),
                            )
                        )
                    )
                ),
                Restaurant(
                    3,
                    "Outback - Moema",
                    "https://static-images.ifood.com.br/image/upload//capa/a10ea022-8d24-4465-b444-9dd91a8052bc/202010282309_jUnz_s@2x.jpg",
                    "Av. Moaci, 187 - Moema, São Paulo",
                    "00:00",
                    listOf(
                        DishList(
                            1,
                            "Aperitivos",
                            listOf(
                                Dish(
                                    1,
                                    "Super wings",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/60364d55-35ad-4231-957c-fd950cb6e7b5/201808311145_super.png",
                                    "Porção de 15 kookaburra wings servidas com o molho blue cheese e aipo crocante. Escolha a intensidade de picância."
                                ),
                                Dish(
                                    2,
                                    "Firecracker shrimp nachos",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/5221af98-5ad4-42e2-a767-23d1545b82d5/202007161629_cdNp_p.png",
                                    "Deliciosos camarões empanados e temperados com o surpreendente molho firecracker. Servidos com tortillas crocantes."
                                )
                            )
                        ),
                        DishList(
                            2,
                            "Favoritos",
                            listOf(
                                Dish(
                                    3,
                                    "Ribs on the barbie",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/5221af98-5ad4-42e2-a767-23d1545b82d5/201911191742_qCKt_r.jpg",
                                    "Preparada em chama aberta como manda a tradição australiana, vem com as saborosas cinnamon apples."
                                ),
                                Dish(
                                    4,
                                    "Junior ribs",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/aadcbd26-8afa-453b-ba51-fb95b2f67a81/201809071118_49758024.jpg",
                                    "Essa versão traz meia rib grelhada em chama aberta e temperada com blend de especiarias."
                                ),
                                Dish(
                                    5,
                                    "Steakhouse pasta",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/aadcbd26-8afa-453b-ba51-fb95b2f67a81/201809071140_49758133.jpg",
                                    "Fettuccine com champignons, tomates frescos e cortes de filet mignon. Refogado com um toque de vinho chardonnay e black pepper."
                                ),
                                Dish(
                                    6,
                                    "Ribs mac and cheese",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/5221af98-5ad4-42e2-a767-23d1545b82d5/202005141339_zw0t_.jpeg",
                                    "Pasta caracolino ao molho de creme de queijos com toque de molho alfredo, finalizado com nossa deliciosa ribs on the barbie desfiada com molho barbecue. Finalizada com crumble do nosso crouton e salsinha."
                                ),
                                Dish(
                                    7,
                                    "The outbacker",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/5221af98-5ad4-42e2-a767-23d1545b82d5/202001151501_8cxM_t.jpg",
                                    "200g de hambúrguer de carne, queijo, picles, tomate, alface, cebola e maionese. Se preferir, peça com bacon também. Troque a maionese por mostarda e peça no melhor estilo mad max.\n"
                                )
                            )
                        ),
                        DishList(
                            3,
                            "Kid's Menu",
                            listOf(
                                Dish(
                                    8,
                                    "Kid's burgers",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/aadcbd26-8afa-453b-ba51-fb95b2f67a81/201809071147_49758222.jpg",
                                    "Três mini burgers com queijo."
                                ),
                                Dish(
                                    9,
                                    "Kid´s chicken fingers",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/a10ea022-8d24-4465-b444-9dd91a8052bc/202004011435_dhBB_c.png",
                                    "Dois pedaços de frango empanados (70g cada), servidos com molho honey mustard."
                                )
                            )
                        )
                    )
                ),
                Restaurant(
                    4,
                    "Sí Señor!",
                    "https://static-images.ifood.com.br/image/upload//capa/201803191504_d16d3e27-06bd-444f-886d-559851fd4263_capa1@2x.jpg",
                    "Alameda Jauaperi, 626 - Moema",
                    "01:00",
                    listOf(
                        DishList(
                            1,
                            "Entradas e snacks!",
                            listOf(
                                Dish(
                                    1,
                                    "Onion rings",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/6dfe9e77-7ed5-4592-a399-e1e1bbe6a64e/202004141250_Avgt_o.jpg",
                                    "(Não é possível alterar ingredientes) Deliciosa porção de onion rings para deixar sua refeição ainda mais gostosa."
                                ),
                                Dish(
                                    2,
                                    "Guacamole com nachos",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/9143d2ce-682d-4205-baef-582abcb42ad3/202003241611_aoZr_n.jpg",
                                    "(Não é possível alterar ingredientes) Nossa imbatível guacamole acompanhada de deliciosos nachos crocantes. Entrada perfeita para duas pessoas."
                                )
                            )
                        ),
                        DishList(
                            2,
                            "Combos!",
                            listOf(
                                Dish(
                                    3,
                                    "Burrito califórnia + nachos ou batata + bebida 23% off",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/9143d2ce-682d-4205-baef-582abcb42ad3/202003241703_wjDg_b.jpg",
                                    "(Não é possível alterar ingredientes) Delicioso burrito de peixe e camarão, recheado com guacamole, sour cream, queijo, alface e pico de gallo, acompanha salsa a parte. Você ainda pode escolher entre nachos ou batata chips de acompanhamento."
                                ),
                                Dish(
                                    4,
                                    "Burrito del cheff + nachos ou batata + bebida 22% off",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/9143d2ce-682d-4205-baef-582abcb42ad3/202003241702_HDzW_b.jpg",
                                    "(Não é possível alterar ingredientes) Delicioso e tradicional burrito recheado com alface, pico de gallo, queijo, sour cream, guacamole e proteína a sua escolha. Você ainda escolhe pode escolher um acompanhamento."
                                ),
                                Dish(
                                    5,
                                    "2 burritos + 2 acompanhamentos + 2 bebidas. 29% off",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/6dfe9e77-7ed5-4592-a399-e1e1bbe6a64e/202003270933_I2lc_i.jpg",
                                    "(Não é possível alterar ingredientes) 2 deliciosos burritos recheados com alface, pico de gallo, queijo, sour cream, guacamole e você escolhe sua proteína. Acompanhado de batata chips ou nachos e por fim nossos refrescantes chá Mate ou pink lemonade (500ml)."
                                ),
                                Dish(
                                    6,
                                    "2 quesadillas+ 2 acompanhamentos + 2 bebidas. 29% off",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/6dfe9e77-7ed5-4592-a399-e1e1bbe6a64e/202003270934_6RlX_i.jpg",
                                    "(Não é possível alterar ingredientes) 2 combos compostos por deliciosas tortillas caseiras tostadas e recheadas com queijos derretido, pico de gallo e acompanhadas por guacamole servida à parte. Escolha o sabor, o acompanhamento e nossos refrescantes chá Mate ou pink lemonade (500ml)."
                                )
                            )
                        ),
                        DishList(
                            3,
                            "Sobremesa!",
                            listOf(
                                Dish(
                                    7,
                                    "Churros - doce de leite",
                                    "https://static-images.ifood.com.br/image/upload/t_high/pratos/9143d2ce-682d-4205-baef-582abcb42ad3/202003241709_IiBw_c.png",
                                    "(Não é possível alterar ingredientes) Porção de 12 mini churros crocantes, acompanham doce de leite."
                                )
                            )
                        )
                    )
                )
            )
        )
    }
}