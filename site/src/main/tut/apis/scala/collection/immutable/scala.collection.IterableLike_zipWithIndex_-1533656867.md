//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#zipWithIndex:List[(A,Int)]">scala.collection.IterableLike#zipWithIndex</a></li>
<li name="scala.collection.IterableLike#zipWithIndex" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="zipWithIndex:List[(A,Int)]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#zipWithIndex:List[(A,Int)]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">zipWithIndex</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[(<span class="extype" name="scala.collection.GenIterableLike.A">A</span>, <a href="../../Int.html" class="extype" name="scala.Int">Int</a>)]</span> </span> <p class="shortcomment cmt">[use case] Zips this list with its indices.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Zips this list with its indices.</p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>A new list containing pairs consisting of all elements of this list paired with their index. Indices start at <code>0</code>.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../GenIterableLike.html" class="extype" name="scala.collection.GenIterableLike">GenIterableLike</a>
   </dd>
   <div class="full-signature-block toggleContainer"> 
    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
    <div class="hiddenContent full-signature-usecase">
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">zipWithIndex</span><span class="tparams">[<span name="A1">A1 &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], (<span class="extype" name="scala.collection.IterableLike.zipWithIndex.A1">A1</span>, <a href="../../Int.html" class="extype" name="scala.Int">Int</a>), <span class="extype" name="scala.collection.IterableLike.zipWithIndex.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.IterableLike.zipWithIndex.That">That</span></span> </span> </h4>
    </div> 
   </div>
   <div class="block">
    Example: 
    <ol>
     <li class="cmt"><p> <code>List("a", "b", "c").zipWithIndex = List(("a", 0), ("b", 1), ("c", 2))</code></p></li>
    </ol> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



