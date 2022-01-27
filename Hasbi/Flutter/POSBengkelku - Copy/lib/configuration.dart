import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:posbengkelku/login.dart';

class ConfigurationPage extends StatefulWidget {
  const ConfigurationPage({Key? key}) : super(key: key);

  @override
  _ConfigurationPageState createState() => _ConfigurationPageState();
}

class _ConfigurationPageState extends State<ConfigurationPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Container(
          child: GridView.count(
            crossAxisCount: 2,
            mainAxisSpacing: 2,
            childAspectRatio: 1/1.17,
            children: [
              Container(
                color: Colors.white,
                child: Center(
                  child: Image.asset("asset/images/logo.png", height: 50),
                ),
              ),

              Container(
                color: Colors.grey[100],
                child: Stack(
                  children: [
                    Container(
                      margin: EdgeInsets.only(left: 100, top: 100),
                      child: Text(
                        "Configuration",
                        style: TextStyle(
                          fontSize: 25,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),

                    Container(
                      margin: EdgeInsets.only(left: 100, top: 230, right: 100 ),
                      child: Column(
                        children: [
                          Container(
                            child: Align(
                              alignment: Alignment.centerLeft,
                              child: Text(
                                "Client",
                                style: TextStyle(
                                    fontSize: 16
                                ),
                              ),
                            )
                          ),

                          SizedBox(
                            height: 10,
                          ),

                          Container(
                            padding: EdgeInsets.only(left: 10, right: 10, top: 5),
                            height: 60,
                            decoration: BoxDecoration(
                                color: Colors.white,
                                borderRadius: BorderRadius.circular(5)
                              ),
                            child: TextField(
                              style: TextStyle(
                                fontSize: 20
                              ),
                              autofocus: false,
                              decoration: InputDecoration(
                                border: InputBorder.none,
                                hintText: "C0003",
                              ),
                            ),
                          ),

                          SizedBox(
                            height: 20,
                          ),

                          Container(
                              child: Align(
                                alignment: Alignment.centerLeft,
                                child: Text(
                                  "Type",
                                  style: TextStyle(
                                      fontSize: 16
                                  ),
                                ),
                              )
                          ),

                          SizedBox(
                            height: 10,
                          ),

                          Container(
                            padding: EdgeInsets.only(left: 10, right: 10, top: 5),
                            height: 60,
                            decoration: BoxDecoration(
                                color: Colors.white,
                                borderRadius: BorderRadius.circular(5)
                            ),
                            child: TextField(
                              style: TextStyle(
                                  fontSize: 20
                              ),
                              autofocus: false,
                              decoration: InputDecoration(
                                border: InputBorder.none,
                                hintText: "Type site",
                              ),
                            ),
                          ),

                          SizedBox(
                            height: 40,
                          ),

                          Container(
                            width: MediaQuery.of(context).size.width,
                            height: 50,
                            color: Colors.white,
                            child: ElevatedButton(
                              onPressed: (){
                                Navigator.of(context).push(MaterialPageRoute(builder: (context){
                                  return LoginPage();
                                }));
                              },
                              child: Text("Select"),
                            ),
                          ),

                          SizedBox(
                            height: 150,
                          ),
                          
                          Text("Powered by Codelabs Indonesia", style: TextStyle(color: Colors.grey[600]),)

                        ],
                      ),
                    )
                  ],
                ),
              )
            ],
          ),
        )
    );
  }
}
