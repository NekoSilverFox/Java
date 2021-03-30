/**
 * -*- coding: utf-8 -*-
 *
 * @Time : 2021/3/30 10:59
 * @Author : NekoSilverfox
 * @FileName: DemoXML
 * @Software: IntelliJ IDEA
 * @Versions: v0.1
 * @Github ：https://github.com/NekoSilverFox
 */

/*
XML - Extensible Markup Language 可扩展标记语言

- **可扩展** - 标签都是自定义的

- 功能：

  - 作为配置文件
  - 方便网络中传输

- 与HTML区别：

  - 共同的父亲w3c（万维网联盟）
  - HTML对语法要求不严格，不能自定义标签，标签是预定义的；是用于展示数据的
  - XML语法允许自定义标签严格，能够自定义标签；是用于存储数据的

- **语法**

  - xml文档的后缀名`xml`
  - xml的第一行必须定义文档的声明或标签的开始，不能是空行
  - xml文档中有且仅有一个根标签
  - 属性值必须使用引号(单双引号都可以)引起来
  - 标签必须真确关闭
  - xml标签名称区分大小写

- **组成部分**

  1. 文档声明

     - 格式：`<?xml 属性列表?>`
     - 属性列表：
       - **version** - 版本号，必须的属性
       - **encoding** - 编码方式，告知解析引擎当前文档的字符集（默认值 ISO-8859-1）。注意要与文件的编码匹配
       - **standalone** - 是否独立
         - yes - 不依赖与其他文件
         - no - 依赖其他文件

  2. 结合CSS的指令（了解）

     `<?xml-stylesheet type="text/css" href="a.css"?>`

  3. 标签

     - 名称可以包含字母、数字以及其他的字符
     - 名称不能以数字或者标点符号开始
     - 名称不能以字母 xml （或者 XML，Xml等）开始
     - 名称不能包含空格

  4. 属性

     - id属性值唯一

  5. 文本

     - CDATA区 - 在该区域中的所有数据会被原样展示
     - 格式：`<![CDATA[ 要展示的数据数据 ]]>`

  6. 注释

     - 和HTML一样
     - 格式：`<!-- 我是一条commant注释 -->`
 */
public class DemoXML {
    public static void main(String[] args) {

    }

}
