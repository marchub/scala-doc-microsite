//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#addString(b:StringBuilder):StringBuilder">scala.collection.TraversableOnce#addString</a></li>
<li name="scala.collection.TraversableOnce#addString" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="addString(b:StringBuilder):StringBuilder"></a><a id="addString(StringBuilder):StringBuilder"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#addString(b:StringBuilder):StringBuilder" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">addString</span><span class="params">(<span name="b">b: <a href="../../index.html#StringBuilder=StringBuilder" class="extmbr" name="scala.StringBuilder">StringBuilder</a></span>)</span><span class="result">: <a href="../../index.html#StringBuilder=StringBuilder" class="extmbr" name="scala.StringBuilder">StringBuilder</a></span> </span> <p class="shortcomment cmt">Appends all elements of this traversable or iterator to a string builder.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Appends all elements of this traversable or iterator to a string builder. The written text consists of the string representations (w.r.t. the method <code>toString</code>) of all elements of this traversable or iterator without any separator string.</p>
   <p>Example:</p>
   <pre>scala&gt; <span class="kw">val</span> a = <span class="std">List</span>(<span class="num">1</span>,<span class="num">2</span>,<span class="num">3</span>,<span class="num">4</span>)
a: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>)

scala&gt; <span class="kw">val</span> b = <span class="kw">new</span> StringBuilder()
b: StringBuilder =

scala&gt; <span class="kw">val</span> h = a.addString(b)
h: StringBuilder = <span class="num">1234</span></pre>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    b
   </dt>
   <dd class="cmt">
    <p>the string builder to which elements are appended.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the string builder <code>b</code> to which elements were appended.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a>
   </dd>
  </dl>
 </div> </li>
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#addString(b:StringBuilder,sep:String):StringBuilder">scala.collection.TraversableOnce#addString</a></li>
<li name="scala.collection.TraversableOnce#addString" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="addString(b:StringBuilder,sep:String):StringBuilder"></a><a id="addString(StringBuilder,String):StringBuilder"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#addString(b:StringBuilder,sep:String):StringBuilder" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">addString</span><span class="params">(<span name="b">b: <a href="../../index.html#StringBuilder=StringBuilder" class="extmbr" name="scala.StringBuilder">StringBuilder</a></span>, <span name="sep">sep: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>)</span><span class="result">: <a href="../../index.html#StringBuilder=StringBuilder" class="extmbr" name="scala.StringBuilder">StringBuilder</a></span> </span> <p class="shortcomment cmt">Appends all elements of this traversable or iterator to a string builder using a separator string.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Appends all elements of this traversable or iterator to a string builder using a separator string. The written text consists of the string representations (w.r.t. the method <code>toString</code>) of all elements of this traversable or iterator, separated by the string <code>sep</code>.</p>
   <p>Example:</p>
   <pre>scala&gt; <span class="kw">val</span> a = <span class="std">List</span>(<span class="num">1</span>,<span class="num">2</span>,<span class="num">3</span>,<span class="num">4</span>)
a: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>)

scala&gt; <span class="kw">val</span> b = <span class="kw">new</span> StringBuilder()
b: StringBuilder =

scala&gt; a.addString(b, <span class="lit">", "</span>)
res0: StringBuilder = <span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span></pre>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    b
   </dt>
   <dd class="cmt">
    <p>the string builder to which elements are appended.</p>
   </dd>
   <dt class="param">
    sep
   </dt>
   <dd class="cmt">
    <p>the separator string.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the string builder <code>b</code> to which elements were appended.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a>
   </dd>
  </dl>
 </div> </li>
        

<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#addString(b:StringBuilder,start:String,sep:String,end:String):StringBuilder">scala.collection.TraversableOnce#addString</a></li>
<li name="scala.collection.TraversableOnce#addString" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="addString(b:StringBuilder,start:String,sep:String,end:String):StringBuilder"></a><a id="addString(StringBuilder,String,String,String):StringBuilder"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#addString(b:StringBuilder,start:String,sep:String,end:String):StringBuilder" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">addString</span><span class="params">(<span name="b">b: <a href="../../index.html#StringBuilder=StringBuilder" class="extmbr" name="scala.StringBuilder">StringBuilder</a></span>, <span name="start">start: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>, <span name="sep">sep: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>, <span name="end">end: <a href="../../Predef$.html#String=String" class="extmbr" name="scala.Predef.String">String</a></span>)</span><span class="result">: <a href="../../index.html#StringBuilder=StringBuilder" class="extmbr" name="scala.StringBuilder">StringBuilder</a></span> </span> <p class="shortcomment cmt">Appends all elements of this traversable or iterator to a string builder using start, end, and separator strings.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Appends all elements of this traversable or iterator to a string builder using start, end, and separator strings. The written text begins with the string <code>start</code> and ends with the string <code>end</code>. Inside, the string representations (w.r.t. the method <code>toString</code>) of all elements of this traversable or iterator are separated by the string <code>sep</code>.</p>
   <p>Example:</p>
   <pre>scala&gt; <span class="kw">val</span> a = <span class="std">List</span>(<span class="num">1</span>,<span class="num">2</span>,<span class="num">3</span>,<span class="num">4</span>)
a: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>)

scala&gt; <span class="kw">val</span> b = <span class="kw">new</span> StringBuilder()
b: StringBuilder =

scala&gt; a.addString(b , <span class="lit">"List("</span> , <span class="lit">", "</span> , <span class="lit">")"</span>)
res5: StringBuilder = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>)</pre>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    b
   </dt>
   <dd class="cmt">
    <p>the string builder to which elements are appended.</p>
   </dd>
   <dt class="param">
    start
   </dt>
   <dd class="cmt">
    <p>the starting string.</p>
   </dd>
   <dt class="param">
    sep
   </dt>
   <dd class="cmt">
    <p>the separator string.</p>
   </dd>
   <dt class="param">
    end
   </dt>
   <dd class="cmt">
    <p>the ending string.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the string builder <code>b</code> to which elements were appended.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples





























