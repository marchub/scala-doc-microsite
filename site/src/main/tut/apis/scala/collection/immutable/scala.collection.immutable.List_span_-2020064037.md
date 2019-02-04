//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#span(p:A=>Boolean):(List[A],List[A])">scala.collection.immutable.List#span</a></li>
<li name="scala.collection.immutable.List#span" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="span(p:A=>Boolean):(List[A],List[A])"></a><a id="span((A)⇒Boolean):(List[A],List[A])"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#span(p:A=>Boolean):(List[A],List[A])" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier">final </span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">span</span><span class="params">(<span name="p">p: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>)</span><span class="result">: (<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>])</span> </span> <p class="shortcomment cmt">Splits this list into a prefix/suffix pair according to a predicate.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Splits this list into a prefix/suffix pair according to a predicate.</p>
   <p> Note: <code>c span p</code> is equivalent to (but possibly more efficient than) <code>(c takeWhile p, c dropWhile p)</code>, provided the evaluation of the predicate <code>p</code> does not cause any side-effects.</p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a pair consisting of the longest prefix of this list whose elements all satisfy <code>p</code>, and the rest of this list.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="" class="extype" name="scala.collection.immutable.List">List</a> → 
    <a href="../LinearSeqOptimized.html" class="extype" name="scala.collection.LinearSeqOptimized">LinearSeqOptimized</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
   </dd>
   <dt>
    Annotations
   </dt>
   <dd> 
    <span class="name">@<a href="../../inline.html" class="extype" name="scala.inline">inline</a></span>
    <span class="args">()</span> 
   </dd>
  </dl>
 </div> </li>
        </ol>


### Examples



