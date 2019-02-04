//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#unzip3[A1,A2,A3](implicitasTriple:A=>(A1,A2,A3)):(CC[A1],CC[A2],CC[A3])">scala.collection.generic.GenericTraversableTemplate#unzip3</a></li>
<li name="scala.collection.generic.GenericTraversableTemplate#unzip3" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="unzip3[A1,A2,A3](implicitasTriple:A=>(A1,A2,A3)):(CC[A1],CC[A2],CC[A3])"></a><a id="unzip3[A1,A2,A3]((A)⇒(A1,A2,A3)):(List[A1],List[A2],List[A3])"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#unzip3[A1,A2,A3](implicitasTriple:A=>(A1,A2,A3)):(CC[A1],CC[A2],CC[A3])" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">unzip3</span><span class="tparams">[<span name="A1">A1</span>, <span name="A2">A2</span>, <span name="A3">A3</span>]</span><span class="params">(<span class="implicit">implicit </span><span name="asTriple">asTriple: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ (<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip3.A1">A1</span>, <span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip3.A2">A2</span>, <span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip3.A3">A3</span>)</span>)</span><span class="result">: (<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip3.A1">A1</span>], <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip3.A2">A2</span>], <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.generic.GenericTraversableTemplate.unzip3.A3">A3</span>])</span> </span> <p class="shortcomment cmt">Converts this collection of triples into three collections of the first, second, and third element of each triple.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Converts this collection of triples into three collections of the first, second, and third element of each triple.</p>
   <pre><span class="kw">val</span> xs = Traversable(
           (<span class="num">1</span>, <span class="lit">"one"</span>, <span class="lit">'1'</span>),
           (<span class="num">2</span>, <span class="lit">"two"</span>, <span class="lit">'2'</span>),
           (<span class="num">3</span>, <span class="lit">"three"</span>, <span class="lit">'3'</span>)).unzip3
<span class="cmt">// xs == (Traversable(1, 2, 3),</span>
<span class="cmt">//        Traversable(one, two, three),</span>
<span class="cmt">//        Traversable(1, 2, 3))</span></pre>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    A1
   </dt>
   <dd class="cmt">
    <p>the type of the first member of the element triples</p>
   </dd>
   <dt class="tparam">
    A2
   </dt>
   <dd class="cmt">
    <p>the type of the second member of the element triples</p>
   </dd>
   <dt class="tparam">
    A3
   </dt>
   <dd class="cmt">
    <p>the type of the third member of the element triples</p>
   </dd>
   <dt class="param">
    asTriple
   </dt>
   <dd class="cmt">
    <p>an implicit conversion which asserts that the element type of this collection is a triple.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a triple of collections, containing the first, second, respectively third member of each element triple of this collection.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../generic/GenericTraversableTemplate.html" class="extype" name="scala.collection.generic.GenericTraversableTemplate">GenericTraversableTemplate</a>
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



