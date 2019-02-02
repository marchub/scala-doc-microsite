//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#mkString:String">scala.collection.TraversableOnce#mkString</a></li>
//<li name="scala.collection.TraversableOnce#mkString" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="mkString:String"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#mkString:String" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">mkString</span><span class="result">: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span> </span> <p class="shortcomment cmt">Displays all elements of this traversable or iterator in a string.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Displays all elements of this traversable or iterator in a string. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a string representation of this traversable or iterator. In the resulting string the string representations (w.r.t. the method <code>toString</code>) of all elements of this traversable or iterator follow each other without any separator string.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
//    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
//   </dd>
//  </dl>
// </div> </li>
//        
//
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#mkString(sep:String):String">scala.collection.TraversableOnce#mkString</a></li>
//<li name="scala.collection.TraversableOnce#mkString" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="mkString(sep:String):String"></a><a id="mkString(String):String"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#mkString(sep:String):String" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">mkString</span><span class="params">(<span name="sep">sep: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>)</span><span class="result">: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span> </span> <p class="shortcomment cmt">Displays all elements of this traversable or iterator in a string using a separator string.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Displays all elements of this traversable or iterator in a string using a separator string. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    sep
//   </dt>
//   <dd class="cmt">
//    <p>the separator string.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a string representation of this traversable or iterator. In the resulting string the string representations (w.r.t. the method <code>toString</code>) of all elements of this traversable or iterator are separated by the string <code>sep</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
//    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
//   </dd>
//   <div class="block">
//    Example: 
//    <ol>
//     <li class="cmt"><p><code>List(1, 2, 3).mkString("|") = "1|2|3"</code></p></li>
//    </ol> 
//   </div>
//  </dl>
// </div> </li>
//        
//
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#mkString(start:String,sep:String,end:String):String">scala.collection.TraversableOnce#mkString</a></li>
//<li name="scala.collection.TraversableOnce#mkString" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="mkString(start:String,sep:String,end:String):String"></a><a id="mkString(String,String,String):String"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#mkString(start:String,sep:String,end:String):String" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">mkString</span><span class="params">(<span name="start">start: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>, <span name="sep">sep: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>, <span name="end">end: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>)</span><span class="result">: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span> </span> <p class="shortcomment cmt">Displays all elements of this traversable or iterator in a string using start, end, and separator strings.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Displays all elements of this traversable or iterator in a string using start, end, and separator strings. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    start
//   </dt>
//   <dd class="cmt">
//    <p>the starting string.</p>
//   </dd>
//   <dt class="param">
//    sep
//   </dt>
//   <dd class="cmt">
//    <p>the separator string.</p>
//   </dd>
//   <dt class="param">
//    end
//   </dt>
//   <dd class="cmt">
//    <p>the ending string.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a string representation of this traversable or iterator. The resulting string begins with the string <code>start</code> and ends with the string <code>end</code>. Inside, the string representations (w.r.t. the method <code>toString</code>) of all elements of this traversable or iterator are separated by the string <code>sep</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
//    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
//   </dd>
//   <div class="block">
//    Example: 
//    <ol>
//     <li class="cmt"><p><code>List(1, 2, 3).mkString("(", "; ", ")") = "(1; 2; 3)"</code></p></li>
//    </ol> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
























