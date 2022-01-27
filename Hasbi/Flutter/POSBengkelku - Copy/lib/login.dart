import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/painting.dart';
import 'package:posbengkelku/configuration.dart';
import 'package:posbengkelku/page/dashboard.dart';

class LoginPage extends StatefulWidget {
  const LoginPage({Key? key}) : super(key: key);

  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {

  bool HidePass = true;

  void ToogleVisibility() {
    setState(() {
      HidePass = !HidePass;
    });
  }

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
                        "Login",
                        style: TextStyle(
                          fontSize: 25,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),

                    GestureDetector(
                      onTap: (){
                        Navigator.of(context).push(MaterialPageRoute(builder: (context){
                          return ConfigurationPage();
                        }));
                      },
                      child: Container(
                        padding: EdgeInsets.only(left: 10),
                        height: 50,
                        width: 170,
                        color: Colors.white,
                        margin: EdgeInsets.only(top: 90, left: 370),
                        child: Row(
                          children: [
                            Icon(Icons.settings)
                          ],
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
                                  "Username",
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
                                hintText: "Alisa",
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
                                  "Password",
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
                              obscureText: HidePass,
                              decoration: InputDecoration(
                                border: InputBorder.none,
                                hintText: "Type your password",
                                suffixIcon: Icon(HidePass ? Icons.visibility_off : Icons.visibility, color: Colors.grey[400])
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
                                  return DashboardPage();
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
