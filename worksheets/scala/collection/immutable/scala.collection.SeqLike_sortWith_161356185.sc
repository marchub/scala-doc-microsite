//
//<ol>
//<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#sortWith(lt:(A,A)=>Boolean):Repr">scala.collection.SeqLike#sortWith</a></li>
//<li name="scala.collection.SeqLike#sortWith" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="sortWith(lt:(A,A)=>Boolean):Repr"></a><a id="sortWith((A,A)⇒Boolean):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#sortWith(lt:(A,A)=>Boolean):Repr" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">sortWith</span><span class="params">(<span name="lt">lt: (<span class="extype" name="scala.collection.immutable.List.A">A</span>, <span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <a href="../../Boolean.html" class="extype" name="scala.Boolean">Boolean</a></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">Sorts this sequence according to a comparison function.</p>
// <div class="fullcomment">
//  <div class="comment cmt">
//   <p>Sorts this sequence according to a comparison function.</p>
//   <p> Note: will not terminate for infinite-sized collections.</p>
//   <p> The sort is stable. That is, elements that are equal (as determined by <code>lt</code>) appear in the same order in the sorted sequence as in the original. </p>
//  </div>
//  <dl class="paramcmts block">
//   <dt class="param">
//    lt
//   </dt>
//   <dd class="cmt">
//    <p>the comparison function which tests whether its first argument precedes its second argument in the desired ordering.</p>
//   </dd>
//   <dt>
//    returns
//   </dt>
//   <dd class="cmt">
//    <p>a sequence consisting of the elements of this sequence sorted according to the comparison function <code>lt</code>.</p>
//   </dd>
//  </dl>
//  <dl class="attributes block"> 
//   <dt>
//    Definition Classes
//   </dt>
//   <dd>
//    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
//   </dd>
//   <div class="block">
//    Example: 
//    <ol>
//     <li class="cmt"><p></p><pre><span class="std">List</span>(<span class="lit">"Steve"</span>, <span class="lit">"Tom"</span>, <span class="lit">"John"</span>, <span class="lit">"Bob"</span>).sortWith(_.compareTo(_) &lt; <span class="num">0</span>) =
//<span class="std">List</span>(<span class="lit">"Bob"</span>, <span class="lit">"John"</span>, <span class="lit">"Steve"</span>, <span class="lit">"Tom"</span>)</pre></li>
//    </ol> 
//   </div>
//  </dl>
// </div> </li>
//        </ol>


//-- START WORKSHEET ---
