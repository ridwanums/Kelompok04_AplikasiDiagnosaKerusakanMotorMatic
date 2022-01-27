  import 'package:carousel_slider/carousel_slider.dart';
  import 'package:flutter/cupertino.dart';
  import 'package:flutter/material.dart';
  import 'package:flutter/painting.dart';

  class BerandaPage extends StatefulWidget {
    const BerandaPage({Key? key}) : super(key: key);

    @override
    _BerandaPageState createState() => _BerandaPageState();
  }

  class _BerandaPageState extends State<BerandaPage> {
    int _current = 0;
    final CarouselController _controller = CarouselController();

    final List<Widget> myData =  [
      Image.asset("asset/images/home/sport.jpg",fit: BoxFit.fitHeight),
      Image.asset("asset/images/home/rendang.jpg", fit: BoxFit.fitHeight),
      Image.asset("asset/images/home/elektronik.jpeg", fit: BoxFit.fitHeight,),
      Image.asset("asset/images/home/food.jpg", fit: BoxFit.fitHeight,),
    ];

    @override
    Widget build(BuildContext context) {
      return Scaffold(
          body: SingleChildScrollView(
            child: Stack(
                children: [
                  Container(
                    height: 200,
                    color: Colors.orange,
                    width: double.infinity,
                    child: CarouselSlider(
                      items: myData,
                      carouselController: _controller,
                      options: CarouselOptions(
                          viewportFraction: 1,
                          autoPlay: true,
                          autoPlayInterval: Duration(seconds: 3),
                          autoPlayAnimationDuration: Duration(milliseconds: 800),
                          autoPlayCurve: Curves.fastOutSlowIn,
                          scrollDirection: Axis.horizontal,
                          onPageChanged: (index, reason){
                            setState(() {
                              _current = index;
                            });
                          }
                        // enlargeCenterPage: true,

                      ),
                    ),
                  ),

                  Container(
                      margin: EdgeInsets.only(top: 180),
                      child: Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: myData.asMap().entries.map(
                                  (entry){
                                return GestureDetector(
                                  onTap: () => _controller.animateToPage(entry.key),
                                  child: Container(
                                    width: 6,
                                    height: 6,
                                    margin: EdgeInsets.symmetric(vertical: 0.8, horizontal: 0.4),
                                    decoration: BoxDecoration(
                                        shape: BoxShape.circle,
                                        color: (Theme.of(context).brightness == Brightness.dark ? Colors.white : Colors.orange)
                                            .withOpacity(_current == entry.key? 0.9 : 0.4)
                                    ),
                                  ),
                                );
                              }
                          ).toList()
                      )
                  ),

                  Container(
                    margin: EdgeInsets.only(top: 30),
                    color: Colors.transparent,
                    height: 30,
                    child: Row(
                      children: [
                        Container(
                          margin: EdgeInsets.only(left: 10),
                          width: 250,
                          padding: EdgeInsets.only(left: 10, right: 10, top: 5, bottom: 5),
                          color: Colors.white,
                          child: Stack(
                            children: [
                              Align(
                                  alignment: Alignment.centerLeft,
                                  child: Icon(Icons.search, size: 15,)
                              ),

                              Container(
                                  margin: EdgeInsets.only(left: 20),
                                  child: Align(
                                    alignment: Alignment.centerLeft,
                                    child: Text(
                                      "Shopee",
                                      style: TextStyle(
                                          color: Colors.orange
                                      ),
                                    ),
                                  )
                              ),

                              Align(
                                alignment: Alignment.centerRight,
                                child: Icon(Icons.camera_alt_outlined, size: 15,),
                              )
                            ],
                          ),
                        ),

                        SizedBox(
                          width: 15,
                        ),

                        Icon(Icons.shopping_cart_outlined, color: Colors.white),

                        SizedBox(
                          width: 15,
                        ),
                        Icon(Icons.sms_outlined, color: Colors.white)
                      ],
                    ),
                  ),

                  Container(
                    height: 170,
                    margin: EdgeInsets.only(top: 250),
                    child: ListView(
                      scrollDirection: Axis.horizontal,
                      children: [
                        Container(
                          child: Stack(
                            children: [
                              Container(
                                padding: EdgeInsets.all(5),
                                child: Column(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                            width: 30,
                                            height: 30,
                                            decoration: BoxDecoration(
                                              color: Colors.white,
                                              borderRadius: BorderRadius.circular(5),
                                              border  : Border.all(),

                                            )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),
                                          
                                          Wrap(
                                            children: [
                                              Text("PeduliLindungi", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),


                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("Gratis Ongkir & Voucher", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Container(
                          child: Stack(
                            children: [
                              Container(
                                padding: EdgeInsets.all(5),
                                child: Column(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("PeduliLindungi", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),


                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("Gratis Ongkir & Voucher", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Container(
                          child: Stack(
                            children: [
                              Container(
                                padding: EdgeInsets.all(5),
                                child: Column(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("PeduliLindungi", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),


                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("Gratis Ongkir & Voucher", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Container(
                          child: Stack(
                            children: [
                              Container(
                                padding: EdgeInsets.all(5),
                                child: Column(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("PeduliLindungi", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),


                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("Gratis Ongkir & Voucher", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Container(
                          child: Stack(
                            children: [
                              Container(
                                padding: EdgeInsets.all(5),
                                child: Column(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("PeduliLindungi", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),


                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("Gratis Ongkir & Voucher", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                        Container(
                          child: Stack(
                            children: [
                              Container(
                                padding: EdgeInsets.all(5),
                                child: Column(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("PeduliLindungi", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),


                                    Container(
                                      height: 70,
                                      width: 70,
                                      child: Column(
                                        children: [
                                          Container(
                                              width: 30,
                                              height: 30,
                                              decoration: BoxDecoration(
                                                color: Colors.white,
                                                borderRadius: BorderRadius.circular(5),
                                                border  : Border.all(),

                                              )
                                          ),

                                          SizedBox(
                                            height: 10,
                                          ),

                                          Wrap(
                                            children: [
                                              Text("Gratis Ongkir & Voucher", style: TextStyle(fontSize: 9), textAlign: TextAlign.center),

                                            ],
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                              )
                            ],
                          ),
                        ),

                      ],
                    ),
                  ),

                  Container(
                    height: 50,
                    margin: EdgeInsets.only(top: 190, left: 20, right: 20),
                    decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(5),
                      boxShadow: [
                        BoxShadow(
                          color: Colors.grey,
                          spreadRadius: 0.1,
                          blurRadius: 3,
                          offset: Offset(0, 0),
                        )
                      ]
                    ),
                    child: Row(
                      children: [
                        Container(
                          padding: EdgeInsets.only(top: 5, bottom: 5, right: 10, left: 10),
                            decoration: BoxDecoration(
                                border: Border(
                                    right: BorderSide(
                                        color: Colors.grey,
                                        width: 0.5
                                    )
                                )
                            ),
                          child: Icon(Icons.qr_code_scanner, size: 30,)
                        ),

                        Container(
                          width: 130,
                            height: 40,
                            padding: EdgeInsets.only(top: 5, bottom: 5, right: 10, left: 10),
                            decoration: BoxDecoration(
                                border: Border(
                                    right: BorderSide(
                                        color: Colors.grey,
                                        width: 0.5
                                    )
                                )
                            ),
                            child: Stack(
                              children: [
                                Container(
                                  child: Row(
                                    children: [
                                      Icon(Icons.monetization_on, size: 15, color: Colors.orange),
                                      Text("Rp. 1.000.000", style: TextStyle(fontSize: 12))
                                    ],
                                  ),
                                ),

                                Container(
                                  margin: EdgeInsets.only(top: 20),
                                  child: Text(
                                    "isi saldo shopeePay",
                                    style: TextStyle(
                                      fontSize: 10
                                    ),
                                  ),
                                )
                              ],
                            )
                        ),

                        Container(
                            height: 40,
                            padding: EdgeInsets.only(top: 5, bottom: 5, right: 10, left: 10),
                            child: Stack(
                              children: [
                                Container(
                                  child: Row(
                                    children: [
                                      Icon(Icons.monetization_on, size: 15, color: Colors.orange),
                                      Text("5.112 Koin", style: TextStyle(fontSize: 12))
                                    ],
                                  ),
                                ),

                                Container(
                                  margin: EdgeInsets.only(top: 20),
                                  child: Text(
                                    "Reward Koin Shopee",
                                    style: TextStyle(
                                        fontSize: 10
                                    ),
                                  ),
                                )
                              ],
                            )
                        ),
                      ],
                    ),
                  ),


              ]
            )
          )
      );
    }
  }
