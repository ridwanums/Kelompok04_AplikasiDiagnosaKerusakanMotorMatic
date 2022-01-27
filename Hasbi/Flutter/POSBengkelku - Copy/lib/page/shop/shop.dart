import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ShopePage extends StatefulWidget {
  const ShopePage({Key? key}) : super(key: key);

  @override
  _ShopePageState createState() => _ShopePageState();
}

class _ShopePageState extends State<ShopePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        child: Column(
          children: [
            Expanded(
              flex: 1,
              child: Container()
            ),

            Divider(height: 3, color: Colors.black),

            Expanded(
                flex: 9,
                child: Container()
            )
          ],
        ),
      ),
    );
  }
}
